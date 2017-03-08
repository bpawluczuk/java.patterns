package pl.itse.patterns.state.machine;

public class TVContext implements IState {

	private IState tvState;

	public void setState(IState state) {
		this.tvState = state;
	}

	public IState getState() {
		return this.tvState;
	}

	@Override
	public void doAction() {
		this.tvState.doAction();
	}

}
