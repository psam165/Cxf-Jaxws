package javax.cxf.service.handler;

import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.log4j.Logger;

public class SimpleLogicalHandler implements LogicalHandler<LogicalMessageContext>{

	private Logger logger = Logger.getLogger(SimpleLogicalHandler.class);
	
	@Override
	public boolean handleMessage(LogicalMessageContext context) {
		logger.info("Logical Handler gets called first.");
		return true;
	}

	@Override
	public boolean handleFault(LogicalMessageContext context) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

}
