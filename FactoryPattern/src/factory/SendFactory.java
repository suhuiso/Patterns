package factory;

import interfaceSender.Sender;
import sender.MailSender;
import sender.SmsSender;

public class SendFactory {

	public Sender Produce (String type) {
		if ("Mail".equals(type)){
			return new MailSender();
		} else if ("SMS".equals(type)) {
			return new SmsSender();
		} else
			System.out.println("please input your correct type!\n");
			return null;
	}
	
	public static Sender ProduceMail () {
		return new MailSender();
	}
	
	public static Sender ProduceSms () {
		return new SmsSender();
		
	}
}
