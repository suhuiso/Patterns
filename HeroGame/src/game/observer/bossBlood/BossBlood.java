package game.observer.bossBlood;

import java.util.ArrayList;


public class BossBlood implements Subject {

	private ArrayList<Object> observers;
	private int bloodCurrent;
	
	public BossBlood() {
		observers = new ArrayList<Object>();
	}
	
	public void setBlood(int blood) {
		this.bloodCurrent = blood;
	}
	
	public int getBlood() {
		return bloodCurrent;
	}
	
	
	@Override
	public void addObserver(Object o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void deleteObserver(Object o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update();
		}
	}
	
	public void bloodChanged() {
		notifyObserver();
	}

}
