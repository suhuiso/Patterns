package patterns.factory.pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}
		return null;
	}

}
