package javax.cxf.service.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;

public class HttpCxfInterceptor extends AbstractSoapInterceptor{

	private Logger logger = Logger.getLogger(HttpCxfInterceptor.class);
	
	public  HttpCxfInterceptor() {
		// TODO Auto-generated constructor stub
		super(Phase.PRE_PROTOCOL);
	}
	
	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		
		logger.info("magic in interceptor");
		// TODO Auto-generated method stub
		 Map<String, List<String>> reqHeaders = CastUtils.cast((Map<?, ?>) message.get(Message.PROTOCOL_HEADERS));

		/* for(String key : reqHeaders.keySet())
		 {
			logger.info(key +" : ");
			for(String value: reqHeaders.get(key)){
				logger.info(value);
			}
		 }*/
		 
		 if (reqHeaders == null) {
	            reqHeaders = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
	        }

	        if (reqHeaders.size() == 0) {
	            message.put(Message.PROTOCOL_HEADERS, reqHeaders);
	        }
	        List<String> temp = new ArrayList<String>();
	        temp.add("application/soap+xml;charset=UTF-8;action=\"simpleaction\"");
	       // reqHeaders.put(SoapBindingConstants.SOAP_ACTION,temp);
	        reqHeaders.put("Content-Type", temp );
	        for(String key : reqHeaders.keySet())
			 {
				logger.info(key +" : ");
				for(String value: reqHeaders.get(key)){
					logger.info(value);
				}
			 }
	}

	
	
}
