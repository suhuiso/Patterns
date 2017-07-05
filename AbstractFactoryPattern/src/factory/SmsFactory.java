package factory;

import interfaceProduce.Provider;
import interfaceSender.Sender;
import sender.SmsSender;

public class SmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender() ;
	}

}
