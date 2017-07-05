package factory;

import interfaceProduce.Provider;
import interfaceSender.Sender;
import sender.WechatSender;

public class WechatFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new WechatSender() ;
	}

}
