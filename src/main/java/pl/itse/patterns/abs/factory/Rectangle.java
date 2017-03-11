package pl.itse.patterns.abs.factory;


public class Rectangle implements IShape {

	@Override
	public void draw() {

		System.out.println("Inside Rectangle::draw() method.");
	}

}
