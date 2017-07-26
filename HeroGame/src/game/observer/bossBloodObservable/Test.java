package game.observer.bossBloodObservable;

import java.util.Observable;

public class Test {

	public static void main(String[] args) {
		Boss boss = new Boss();
		boss.addObserver(new SmallShock());
		
		boss.setBlood(10000);
		boss.setBlood(5000);
	}
}
