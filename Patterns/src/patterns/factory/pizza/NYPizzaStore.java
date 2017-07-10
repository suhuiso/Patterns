package patterns.factory.pizza;
public class NYPizzaStore extends PizzaStore {
	
	public NYPizzaStore()  {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pizza createPizza(String type) {

		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		}
		return null;
	}
	
	

}
