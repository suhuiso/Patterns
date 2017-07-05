package test;

import java.util.List;

import builder.Builder;
import interfaceSender.Sender;

public class main {
	
	public static void main (String[] args){
		Builder build = new Builder();
		List<Sender> list = build.buildMailSender(10);
		for(Sender sender : list){
			sender.send();
		}
	}
}
