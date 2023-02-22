package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	// Implement object variables - a topic is required
	private String topic;

	
	// Constructor
    public CreateTopicMsg(String user, String topic) {
    	
    	super(MessageType.CREATETOPIC, user);
    	this.topic = topic;

    }
    
    

	// TODO: 
	// Complete the constructor, get/set-methods, and toString method
    // as described in the project text	
    
    
    // get-method
    public String getTopic() {
    	
    	return topic;
    
	}
    
    // set-method
    public void setTopic(String topic) {
    	this.topic = topic;
    }



    //toString method
	@Override
	public String toString() {
		return "CreateTopicMsg [topic=" + topic + "]";
	}
    
   
    
    
    
    
}
