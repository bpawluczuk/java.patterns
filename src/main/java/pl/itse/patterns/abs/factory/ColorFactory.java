package pl.itse.patterns.abs.factory;

public class ColorFactory extends AbstractFactory {

	@Override
	public IColor getColor(String color) {

		if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	         
	      }else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }	      
	      
		return null;
	}

	@Override
	public IShape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
