package game.decorator.weapon;

public class WeaponTest {

	public static void main(String[] args) {
		Role shooter = new ShooterRole();
		System.out.println("我的角色是；" + shooter.name);
		System.out.println("我原来的武器是：" + shooter.getWeapon());
		System.out.println("我原来的攻击力是：" + shooter.attackPower());
		
		shooter = new AxeWeapon(shooter);
		shooter = new KnifeWeapon(shooter);
		System.out.println("我现在的武器是：" + shooter.getWeapon());
		System.out.println("我现在的攻击力是：" + shooter.attackPower());
	}
}
