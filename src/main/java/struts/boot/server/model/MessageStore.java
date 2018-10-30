package struts.boot.server.model;

public class MessageStore {

	private String message;
	
	public MessageStore() {
		message = "Hello world from spring-boot & struts!";
	}
	
	public String getMessage() {
		return message;
	}
}
