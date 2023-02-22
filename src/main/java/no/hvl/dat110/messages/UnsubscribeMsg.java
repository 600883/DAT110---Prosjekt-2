package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic
	
	
	// object variables
	private String topic;

	
	// constructor
    public UnsubscribeMsg(String user, String topic) {
    	
    	super(MessageType.UNSUBSCRIBE, user);
    	this.topic = topic;

    }

    
    // get-method
	public String getTopic() {
		return topic;
	}

	
	// set-method
	public void setTopic(String topic) {
		this.topic = topic;
	}

	// toString method
	@Override
	public String toString() {
		return "UnsubscribeMsg [topic=" + topic + "]";
	}

	// TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
    
    
}
