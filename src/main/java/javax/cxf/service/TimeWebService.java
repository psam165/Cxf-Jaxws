package javax.cxf.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

import org.apache.log4j.Logger;

@WebService
//@BindingType(value="http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class TimeWebService  implements TimeSEI
{

	private static Logger log4j = Logger.getLogger(TimeWebService.class);
	@Override
	@WebMethod(action="simpleaction")
	public Date getDate() throws TimerException {
		//throw new TimerException("Fault reason", "Fault details");
		log4j.info("Getting Date");
		return new Date();
	}

	@Override
	@WebMethod
	public String getDateByZone(String zone) {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		TimeZone tz =TimeZone.getTimeZone(zone);
		df.setTimeZone(tz);
		return df.format(date);
		
	}

	@Override
	@WebMethod
	public List<String> getJustMap() {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("Ellicott city");
		list.add("WoodStock");
		return list;
	}

}
