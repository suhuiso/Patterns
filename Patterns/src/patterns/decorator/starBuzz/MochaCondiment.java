package patterns.decorator.starBuzz;

public class MochaCondiment extends Beverage {
	
	Beverage berverage;
	
	public MochaCondiment(Beverage berverage) {
		this.berverage = berverage;
	}
	
	public String getDescription() {
		return berverage.getDescription() + ", Mocha";
		
	}
	
	public double cost() {
		return berverage.cost() + .20;
		
	}
}
