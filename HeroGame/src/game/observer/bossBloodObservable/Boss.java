package game.observer.bossBloodObservable;

import java.util.Observable;

public class Boss extends Observable {
	
	int bloodCurrent;
	
	public void setBlood(int blood) {
		this.bloodCurrent = blood;
		System.out.println("my blood volume is: " + blood);
		setChanged();
		notifyObservers(blood);
	}

}

