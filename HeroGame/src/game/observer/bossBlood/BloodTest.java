package game.observer.bossBlood;

public class BloodTest {

	public static void main(String[] args) {
		Boss boss = new Boss();
		SmallShock shock = new SmallShock(boss);
		
		boss.setBlood(10000);
		boss.setBlood(5000);
	}
}
