package test;

import factory.SendFactory;
import interfaceSender.Sender;

public class main {
//	public static void main(String[] args) {
//		SendFactory factory = new SendFactory();
////		Sender sender = factory.Produce("Mail");
//		
//		Sender sender = factory.ProduceSms();
//	
//		sender.send();
//	}
	
	public static void main (String[] args) {
		Sender sender = SendFactory.ProduceSms() ;
		sender.send() ;
	}
}

