package javax.cxf.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TimeSEI {

	@WebMethod
	public Date getDate() throws TimerException;
	
	@WebMethod
	public String getDateByZone(String zone);
	
	@WebMethod
	public List<String> getJustMap();
}
