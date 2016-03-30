package javax.cxf.service;

public class TimerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String details;
	
	public TimerException(String reason, String details){
		super(reason);
		this.details=details;
	}
	
	public String getFaultInfo(){
		return details;
	}
	
}
