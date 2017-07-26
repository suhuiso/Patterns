package game.factory.monster;

public class Test {
	public static void main(String[] args) {
		MonsterFactory factory = new DragonFactory();
		Monster monster = factory.createMonster(1000);
		monster.display();
		
		Monster monster2 = factory.createMonster(2000);
		monster2.display();
	}

}

