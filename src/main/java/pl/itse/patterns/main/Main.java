package pl.itse.patterns.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.itse.patterns.abs.factory.AbstractFactory;
import pl.itse.patterns.abs.factory.FactoryProducer;
import pl.itse.patterns.abs.factory.IColor;
import pl.itse.patterns.abs.factory.IShape;
import pl.itse.patterns.decorator.Circle;
import pl.itse.patterns.decorator.Rectangle;
import pl.itse.patterns.decorator.RedShapeDecorator;
import pl.itse.patterns.decorator.Shape;
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

		// State machine pattern

		System.out.println("\n*** Design pattern: State machine ***\n");

		TVContext context = new TVContext();
		IState tvStartState = new TVStartState();
		IState tvStopState = new TVStopState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();

		// Strategy pattern

		System.out.println("\n*** Design pattern: Strategy ***\n");

		TaxContextStrategy contextStrategyA = new TaxContextStrategy(new TaxPL());
		contextStrategyA.executeStrategy();

		TaxContextStrategy contextStrategyB = new TaxContextStrategy(new TaxEN());
		contextStrategyB.executeStrategy();

		// Decorator pattern

		System.out.println("\n*** Design pattern: Decorator ***\n");

		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();

		// Abstract factory

		System.out.println("\n*** Design pattern: Abstract factory ***\n");
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		IShape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		IShape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();

		IShape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		IColor color1 = colorFactory.getColor("RED");
		color1.fill();

		IColor color2 = colorFactory.getColor("Green");
		color2.fill();

		IColor color3 = colorFactory.getColor("BLUE");
		color3.fill();
	}
}
