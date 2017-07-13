package game.decorator.weapon;

public class KnifeWeapon extends WeaponDecorator {
	
	Role role;
	
	public KnifeWeapon(Role role) {
		this.role = role;
	}

	@Override
	public String getWeapon() {
		// TODO Auto-generated method stub
		return role.getWeapon() + ", С��";
	}

	@Override
	public int attackPower() {
		// TODO Auto-generated method stub
		return role.attackPower() + 200;
	}

	

}
