package pl.itse.patterns.abs.factory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public IColor getColor(String color) {
      
	       return null;
	}

	@Override
	public IShape getShape(String shapeType) {

	      if(shapeType == null){
	          return null;
	       }		
	       
	       if(shapeType.equalsIgnoreCase("CIRCLE")){
	          return new Circle();
	          
	       }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	          return new Rectangle();
	          
	       }else if(shapeType.equalsIgnoreCase("SQUARE")){
	          return new Square();
	       }
	       
		return null;
	}

}
