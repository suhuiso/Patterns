package patterns.factory.pizza;

public class TestPizza {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza nyPizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + nyPizza.getName() + "\n");
		
		
		Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
		System.out.println("John ordered a " + chicagoPizza.getName() + "\n");

		}

}
