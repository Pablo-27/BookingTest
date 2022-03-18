package enums;

public enum Message {

	MSG_ERR_TITULO("valor esperado \"%s\" no ha sido encontrado"), 
	MSG_ERR_LOGIN("No ha podido iniciar sesion");

	String message;

	private Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
