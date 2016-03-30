package javax.cxf.service.handler;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

import org.apache.log4j.Logger;

public class HeaderHandler implements  SOAPHandler<SOAPMessageContext>{
	
	private Logger logger = Logger.getLogger(HeaderHandler.class);
	
	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean handleMessage(SOAPMessageContext context) {
			
		if((boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)){
			logger.info("SOAP message handler in action after logical handler");
		}else{
			logger.info("SOAP message handler in action before logical handler");
		}
		
		SOAPMessage message = context.getMessage();
		SOAPHeader header=null;
		try {
			header = message.getSOAPHeader();
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Header is "+ header);
		if(header==null){
				sendFault(message);
			}
		
		return false;
	}
	
	public void sendFault(SOAPMessage message) {
		
			SOAPBody body;
			SOAPFault fault=null;
			try {
				body = message.getSOAPBody();
				fault = body.addFault();
				fault.setFaultString("No valid headers present.");
			} catch (SOAPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			throw new SOAPFaultException(fault);
		
		
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
