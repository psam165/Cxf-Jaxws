package javax.cxf.service;


import java.util.concurrent.TimeUnit;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

import org.apache.log4j.Logger;

@WebService
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class GreetingService {
	
private static Logger log4j = Logger.getLogger(GreetingService.class);
	
	@WebMethod
	public String greet(){
		log4j.info("Just checking......log4j");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello World";
	}

}
