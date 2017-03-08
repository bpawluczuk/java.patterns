package pl.itse.patterns.strategy;

public class TaxEN implements IStrategy {

	@Override
	public int task() {
		System.out.println("English tax");
		return 0;
	}

}
