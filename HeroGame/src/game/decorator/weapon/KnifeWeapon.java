package game.decorator.weapon;

public class KnifeWeapon extends WeaponDecorator {
	
	Role role;
	
	public KnifeWeapon(Role role) {
		this.role = role;
	}

	@Override
	public String getWeapon() {
		return role.getWeapon() + ", knife";
	}

	@Override
	public int attackPower() {
		return role.attackPower() + 200;
	}

}

