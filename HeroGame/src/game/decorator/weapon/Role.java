package game.decorator.weapon;

public abstract class Role {
	
	String name;
	String weapon;
	
	public String getWeapon() {
		return weapon;
	}
	
	public abstract int attackPower();

}
