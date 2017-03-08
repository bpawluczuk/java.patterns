package pl.itse.patterns.state.machine;

public class TVStopState implements IState {

	@Override
	public void doAction() {

		System.out.println("TV is turned OFF");
	}

}
