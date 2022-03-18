package exceptions;

public class FailedBookingTaxi extends AssertionError {
	
	
	private static final long serialVersionUID = 1L;
	public static final String BOOKING_FAILED_MESSAGE = "NO SE HA PODIDO RESERVAR EL TAXI";

	public FailedBookingTaxi(String message, Throwable cause) {
		super(message, cause);
	}
	

}
