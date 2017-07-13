package game.decorator.weapon;

public class ShooterRole extends Role{

		public ShooterRole() {
			name = "����";
			weapon = "ǹ";
		}
		
		public String getWeapon() {
			return weapon;
			
		}

		@Override
		public int attackPower() {
			// TODO Auto-generated method stub
			return 1000;
		}
		
}
