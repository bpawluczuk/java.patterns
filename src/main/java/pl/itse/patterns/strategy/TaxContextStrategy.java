package pl.itse.patterns.strategy;

public class TaxContextStrategy {

	private IStrategy strategy;

	public TaxContextStrategy(IStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void executeStrategy() {

		strategy.task();
	}
}
