package struts.boot.server.actions;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import struts.boot.server.model.MessageStore;

@Component
public class HelloWorldAction extends ActionSupport {
	
	private static final long serialVersionUID = 134567L;
	
    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore() ;
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

}
