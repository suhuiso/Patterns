package test;

import factory.MailFactory;
import factory.SmsFactory;
import factory.WechatFactory;
import interfaceProduce.Provider;
import interfaceSender.Sender;

public class main {
	public static void main (String[] args) {
		Provider provider = new WechatFactory() ;
		Sender sender = provider.produce() ;
		sender.send();
	}
	
}
