package starBuzz;

public class MilkCondiment extends CondimentDecorator {
	Beverage beverage;

	public MilkCondiment(Beverage beverage) {
		this.beverage = beverage;
	}


	public double cost() {
		return .10 + beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Milk";
	}

}
