package game.observer.bossBlood;

public class SmallShock implements Observer {

	private int bloodCurrent;
	private Subject boss;
	
	public SmallShock(Subject boss) {
		this.boss = boss;
		boss.addObserver(this);
	}
	
	@Override
	public void update(int blood) {
		// TODO Auto-generated method stub
		this.bloodCurrent = blood;
		System.out.println("hey, i'm boss. right now my blood volume is: " + bloodCurrent);
		if (bloodCurrent == 5000) {
			System.out.println("small shock is ready");
		}
	}

}
