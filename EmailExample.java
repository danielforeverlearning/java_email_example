//https://www.checktls.com/TestReceiver
//https://www.checktls.com/TestReceiver

//found for work emailaddress


//https://stackoverflow.com/questions/16115453/javamail-could-not-convert-socket-to-tls-gmail
//https://stackoverflow.com/questions/16115453/javamail-could-not-convert-socket-to-tls-gmail

//trying to fix:
//javax.mail.MessagingException: Could not convert socket to TLS;

//javax.mail.MessagingException: Could not convert socket to TLS;
//  nested exception is:
//        java.net.SocketTimeoutException: Read timed out
//        at com.sun.mail.smtp.SMTPTransport.startTLS(SMTPTransport.java:2155)
//        at com.sun.mail.smtp.SMTPTransport.protocolConnect(SMTPTransport.java:752)
//        at javax.mail.Service.connect(Service.java:388)
//        at javax.mail.Service.connect(Service.java:246)
//        at javax.mail.Service.connect(Service.java:195)
//        at javax.mail.Transport.send0(Transport.java:254)
//        at javax.mail.Transport.send(Transport.java:124)
//        at SendEmailTLS.main(SendEmailTLS.java:55)
//Caused by: java.net.SocketTimeoutException: Read timed out
//        at java.net.SocketInputStream.socketRead0(Native Method)
//        at java.net.SocketInputStream.socketRead(SocketInputStream.java:116)
//        at java.net.SocketInputStream.read(SocketInputStream.java:171)
//        at java.net.SocketInputStream.read(SocketInputStream.java:141)
//        at sun.security.ssl.InputRecord.readFully(InputRecord.java:465)
//        at sun.security.ssl.InputRecord.readV3Record(InputRecord.java:593)
//        at sun.security.ssl.InputRecord.read(InputRecord.java:532)
//        at sun.security.ssl.SSLSocketImpl.readRecord(SSLSocketImpl.java:983)
//        at sun.security.ssl.SSLSocketImpl.performInitialHandshake(SSLSocketImpl.java:1385)
//        at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1413)
//        at sun.security.ssl.SSLSocketImpl.startHandshake(SSLSocketImpl.java:1397)
//        at com.sun.mail.util.SocketFetcher.configureSSLSocket(SocketFetcher.java:626)
//        at com.sun.mail.util.SocketFetcher.startTLS(SocketFetcher.java:553)
//        at com.sun.mail.smtp.SMTPTransport.startTLS(SMTPTransport.java:2150)
//        ... 7 more

//"javac.exe" -classpath javax.mail.jar  EmailExample.java
//"java.exe"  -cp .;javax.mail.jar       EmailExample


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailExample {

    public static void main(String[] args) {

        final String username    = "asfsadasdf";
        
		final String password  = "asdfasdfsadf";


        Properties props = System.getProperties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "sadfsadfasdfasdf");
        props.put("mail.smtp.port", "25");
		
		props.put("mail.smtp.ssl.trust", "asdfasdfasdfsadf");
		
		props.put("mail.smtp.connectiontimeout", "30000");
		props.put("mail.smtp.timeout", "30000");

        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
				
        try {
			
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("asdfasdf@asdfasf.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("asdffasef@asdfasdfsadf.com"));
            message.setSubject("Testing Email");
            message.setText("hi how are you,"
                    + "\n\n Please do not spam my email!");

            
			Transport.send(message);

            System.out.println("Done");

        }
		catch (MessagingException ex) {
            ex.printStackTrace();
        }
		
    }//main
}//EmailExample

