package pl.itse.patterns.abs.factory;

public class Blue implements IColor {

	@Override
	public void fill() {

		System.out.println("Inside Blue::fill() method.");
	}

}
