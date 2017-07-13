package game.strategy.hero;

public class HeroTest {
	
	public static void main(String[] args){
		
		Role roleA = new RoleA("����");
		roleA.setAttack(new ShootAttack());
		roleA.setDefend(new ClothesDefend());
		System.out.println("�ҵĽ�ɫ�ǣ�" + roleA.name);
		roleA.peformAttack();
		roleA.peformDefend();
	}
	
}
