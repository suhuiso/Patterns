package sender;

import interfaceSender.Sender;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("I'm Mail Sender!\n");
	}

}
