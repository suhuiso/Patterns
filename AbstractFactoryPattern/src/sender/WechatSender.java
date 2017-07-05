package sender;

import interfaceSender.Sender;

public class WechatSender implements Sender {

	@Override
	public void send() {
		System.out.println("I'm wechat!");
	}

}
