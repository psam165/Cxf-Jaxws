package javax.cxf.service;


import java.util.concurrent.TimeUnit;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

@WebService
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class GreetingService {
	


	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Publishing....");
		Endpoint.publish("http://localhost:8084/Greet", new GreetingService());

	}*/
	
	@WebMethod
	public String greet(){
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hello World";
	}

}
