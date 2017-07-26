package game.decorator.weapon;

public class ShooterRole extends Role{

		public ShooterRole() {
			name = "shooter";
			weapon = "gun";
		}
		

		@Override
		public int attackPower() {
			// TODO Auto-generated method stub
			return 1000;
		}
		
}

