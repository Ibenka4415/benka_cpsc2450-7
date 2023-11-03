import java.util.ArrayList;
import java.util.List;

public class Email {
	
	
	private String Body;
	private String Subject;
	private boolean Sent;
	private List<String> Reciveir;
	
	public Email() {
		Reciveir = new ArrayList<>();
		Subject = "";
		Body = "";
		Sent = false;
	}
	
	public Email(List<String>Reciveir,String Body,String Subject) {
		this.Reciveir = Reciveir;
		this.Subject = Subject;
		this.Body = Body;
		this.Sent = true;
		
	}
	public List<String> getRecipients() {
        return Reciveir;
    }

    public void setRecipients(List<String> recipients) {
        this.Reciveir = recipients;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        this.Subject = subject;
    }

    public String getBody() {
        return Body;
    }
    public void setBody(String body) {
        this.Body = body;
    }

    public boolean isSent() {
        return Sent;
    }

 
    public void send() {
        Sent = true;
    }

    
    public String toString() {
    	String status = "not sent";
    	if (Sent){
    		status = "sent";
    	}
        return 
                "To:		" + Reciveir +"\n"+
                "Subject:   " + Subject + "\n" +
                "Status:    " + status + "\n"+
                "Body: \n" + Body + "\n"      
                ;
    }
    public String getSummary() {
    	String status = "not sent";
    	if (Sent){
    		status = "sent";
    	}
        return String.join(",", Reciveir) + "\t" + Subject + "\t" + Body + "\t" + status;
    }
}


