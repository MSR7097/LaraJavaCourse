class Email {
    private String sender;
    private String recipient;
    private String subject;
    private String body;

	public String getSender()
	{
		return sender;
	}

	public String getRecipient()
	{
		return recipient;
	}

	public String getSubject()
	{
		return subject;
	}

	public String getBody()
	{
		return body;
	}

	public void setSender(String sender)
	{
		this.sender = sender;
	}

	public void setRecipient(String recipient)
	{
		this.recipient=recipient;
	}

	public void setBody(String body)
	{
		this.body=body;
	}
	public void setSubject(String subject)
	{
		this.subject=subject;
	}

}

class Mail
{


    // Getters and setters for sender, recipient, subject, and body
    // ...

    public static void main(String[] args)
		
	{
        Email email = new Email();
        email.setSender("john@example.com");
        email.setRecipient("jane@example.com");
        email.setSubject("Hello");
        email.setBody("This is a test email.");
        String sender = email.getSender();
        String recipient = email.getRecipient();
        String subject = email.getSubject();
        String body = email.getBody();
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}