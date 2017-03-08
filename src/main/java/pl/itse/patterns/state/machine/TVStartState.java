package pl.itse.patterns.state.machine;

public class TVStartState implements IState {

	@Override
	public void doAction() {
		
		System.out.println("TV is turned ON");
	}

}
