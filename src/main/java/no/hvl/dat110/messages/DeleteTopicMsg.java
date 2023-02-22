package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {
	
	//objectvariables
	private String topic;

	// message sent from client to create topic on the broker

	
	// constructor
    public DeleteTopicMsg(String user, String topic) {
    	
    	super(MessageType.DELETETOPIC, user);
    	this.topic = null;
    	
    }

    
    //get-method
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
		return "DeleteTopicMsg [topic=" + topic + "]";
	}
    
	// TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
    
    

    
    
}
