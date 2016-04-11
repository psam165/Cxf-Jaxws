package javax.cxf.service;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;


//@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
//@Addressing(enabled=true,required=true)
@WebService
public class GreetingService {
	
private static Logger log4j = Logger.getLogger(GreetingService.class);
	
	//@WebMethod(action="http://service.cxf.javax/Greet")
	@WebMethod
	@SOAPBinding
	public String greet(){
		log4j.info("Getting greeting of the day");
		return "Hello World";
	}

	
	
}
