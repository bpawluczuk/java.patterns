package pl.itse.patterns.strategy;

public class TaxPL implements IStrategy {

	@Override
	public int task() {
		System.out.println("Polish tax");
		return 0;
	}

}
