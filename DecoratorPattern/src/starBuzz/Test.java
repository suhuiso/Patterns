package starBuzz;

public class Test {

		public static void main(String[] args) {
			Beverage beverage1 = new Decaf();
			System.out.println("your order is :" + beverage1.getDescription());
			System.out.println("your bill is :" + beverage1.cost());
			
			Beverage beverage2 = new Decaf();
			beverage2 = new MochaCondiment(beverage2);
			System.out.println(beverage2.description);
			System.out.println("your order is :" + beverage2.getDescription());
			System.out.println("your bill is :" + beverage2.cost());

		}
}
