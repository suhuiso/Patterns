package game.decorator.weapon;

public class WeaponTest {

	public static void main(String[] args) {
		Role shooter = new ShooterRole();
		System.out.println("�ҵĽ�ɫ�ǣ�" + shooter.name);
		System.out.println("��ԭ���������ǣ�" + shooter.getWeapon());
		System.out.println("��ԭ���Ĺ������ǣ�" + shooter.attackPower());
		
		shooter = new AxeWeapon(shooter);
		shooter = new KnifeWeapon(shooter);
		System.out.println("�����ڵ������ǣ�" + shooter.getWeapon());
		System.out.println("�����ڵĹ������ǣ�" + shooter.attackPower());
	}
}
