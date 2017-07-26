package game.decorator.weapon;

public class AxeWeapon extends WeaponDecorator {

	Role role;
	
	public AxeWeapon(Role role) {
		this.role = role;
	}

	@Override
	public String getWeapon() {
		return role.getWeapon() + ", axe";
	}

	@Override
	public int attackPower() {
		return role.attackPower() + 300;
	}
	
}
