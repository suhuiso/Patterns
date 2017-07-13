package game.strategy.hero;

public class HeroTest {
	
	public static void main(String[] args){
		
		Role roleA = new RoleA("射手");
		roleA.setAttack(new ShootAttack());
		roleA.setDefend(new ClothesDefend());
		System.out.println("我的角色是：" + roleA.name);
		roleA.peformAttack();
		roleA.peformDefend();
	}
	
}
