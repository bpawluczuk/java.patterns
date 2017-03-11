package pl.itse.patterns.abs.factory;


public class Square implements IShape {

	@Override
	public void draw() {
		
		System.out.println("Inside Square::draw() method.");
	}

}
