package patterns.factory.pizza;

public abstract class PizzaStore {
	
	public abstract Pizza createPizza(String type);//ͨ�������������������Ĵ���
	
	public final Pizza orderPizza(String type) {
		
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
