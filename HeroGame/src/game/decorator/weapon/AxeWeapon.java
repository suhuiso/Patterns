package game.decorator.weapon;

public class AxeWeapon extends WeaponDecorator {

	Role role;
	
	public AxeWeapon(Role role) {
		this.role = role;
	}

	@Override
	public String getWeapon() {
		// TODO Auto-generated method stub
		return role.getWeapon() + ", axe";
	}

	@Override
	public int attackPower() {
		// TODO Auto-generated method stub
		return role.attackPower() + 300;
	}
	
}
