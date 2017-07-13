package game.strategy.hero;

public abstract class Role {
	
	String name;
	AttackBehavior attackBehavior;
	DefendBehavior defendBehavior;
	
	public void setAttack(AttackBehavior attack){
		this.attackBehavior = attack;
	}

	public void setDefend(DefendBehavior defend){
		this.defendBehavior = defend;
	}
	
	public void peformAttack(){
		attackBehavior.attack();
	}
	
	public void peformDefend(){
		defendBehavior.defend();
	}
}
