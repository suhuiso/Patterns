package game.strategy.hero;

public class HeroTest {
	
	public static void main(String[] args){
		
		Role roleA = new RoleA("shooter");
		roleA.setAttack(new ShootAttack());
		roleA.setDefend(new VestDefend());
		System.out.println("my character is£º" + roleA.name);
		roleA.peformAttack();
		roleA.peformDefend();
	}
	
}
