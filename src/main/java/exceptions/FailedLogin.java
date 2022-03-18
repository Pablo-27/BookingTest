package exceptions;

public class FailedLogin extends AssertionError {
	public static final String LOGIN_FAILED_MESSAGE = "NO SE HA PODIDO LOGUEAR EN LA PAGINA";

	public FailedLogin(String message, Throwable cause) {
		super(message, cause);
	}
}
