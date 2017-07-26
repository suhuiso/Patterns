package game.factory.monster;

public class Monster {
	String name;
	int blood;
	String skill;
	public void display() {
		System.out.println("i'm "+name+", my hp is: "+blood+", my skill is: "+skill);
	}
}

