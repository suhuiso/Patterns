package game.factory.monster;

public class DragonFactory implements MonsterFactory {
	@Override
	public Monster createMonster(int blood) {
		switch (blood) {
		case 1000:
			return new smallDragon();
		case 2000:
			return new bigDragon();
		default:
			break;
		}
		return null;
	}

}

