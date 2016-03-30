package javax.cxf.service;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import org.apache.log4j.Logger;

@WebService
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)

//@HandlerChain(file="/WEB-INF/jaxws-handler.xml")
public class GreetingService {
	
private static Logger log4j = Logger.getLogger(GreetingService.class);
	
	@WebMethod
	@SOAPBinding
	public String greet(){
		log4j.info("Getting greeting of the day");
		return "Hello World";
	}

	/*public static void main(String...strings){
		Endpoint.publish("http://localhost:8080/Cxf-Jaxws/Greet", new GreetingService());
	}*/
	
}
