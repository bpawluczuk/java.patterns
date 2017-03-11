package pl.itse.patterns.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.itse.patterns.state.machine.IState;
import pl.itse.patterns.state.machine.TVContext;
import pl.itse.patterns.state.machine.TVStartState;
import pl.itse.patterns.state.machine.TVStopState;
import pl.itse.patterns.strategy.TaxContextStrategy;
import pl.itse.patterns.strategy.TaxEN;
import pl.itse.patterns.strategy.TaxPL;

/*
* Design Patterns examples in Java
* 
* @author Borys Pawluczuk
*/

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		// State machine
		
		TVContext context = new TVContext();
		IState tvStartState = new TVStartState();
		IState tvStopState = new TVStopState();
		
		context.setState(tvStartState);
		context.doAction();		
		
		context.setState(tvStopState);
		context.doAction();

		// Strategy patterns

		TaxContextStrategy contextStrategyA = new TaxContextStrategy(new TaxPL());
		contextStrategyA.executeStrategy();

		TaxContextStrategy contextStrategyB = new TaxContextStrategy(new TaxEN());
		contextStrategyB.executeStrategy();
	}
}
