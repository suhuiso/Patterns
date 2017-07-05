package factory;

import interfaceProduce.Provider;
import interfaceSender.Sender;
import sender.MailSender;

public class MailFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender() ;
	}
	

}
