package game.observer.bossBlood;

public interface Subject {

	public void addObserver(Object o);
	public void deleteObserver(Object o);
	public void notifyObserver();
		
}
