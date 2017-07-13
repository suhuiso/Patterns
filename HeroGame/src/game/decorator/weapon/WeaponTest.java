package game.decorator.weapon;

public class WeaponTest {

	public static void main(String[] args) {
		Role shooter = new ShooterRole();
		System.out.println("my character is: " + shooter.name);
		System.out.println("my original weapon is£º" + shooter.getWeapon());
		System.out.println("my original ATK is£º" + shooter.attackPower());
		
		shooter = new AxeWeapon(shooter);
		shooter = new KnifeWeapon(shooter);
		System.out.println("I got my new weapon£º" + shooter.getWeapon());
		System.out.println("now my ATK is£º" + shooter.attackPower());
	}
}
