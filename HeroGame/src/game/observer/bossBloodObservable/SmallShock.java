package game.observer.bossBloodObservable;

import java.util.Observable;
import java.util.Observer;

public class SmallShock implements Observer {

	Boss bossoss;
	
	@Override
	public void update(Observable boss, Object arg) {
		this.bossoss = (Boss)boss;
		if (bossoss.bloodCurrent == 5000) {
			System.out.println("small shock is ready.");
		}
	}

}

