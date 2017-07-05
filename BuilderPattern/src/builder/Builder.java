package builder;

import java.util.ArrayList;
import java.util.List;
import interfaceSender.Sender;
import sender.MailSender;
import sender.SmsSender;

public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>(); 
	
	public List<Sender> buildMailSender(int count){
		for(int i = 0; i < count; i ++){
			list.add(new MailSender());
		}
		return list ;
	}
	
	public List<Sender> buildSmsSender(int count){
		for(int i = 0; i < count; i++){
			list.add(new SmsSender());
		}
		return list ;
	}
}
