package pl.itse.patterns.abs.factory;

public abstract class AbstractFactory {

	public abstract IColor getColor(String color);
	public abstract IShape getShape(String shapeType);
}
