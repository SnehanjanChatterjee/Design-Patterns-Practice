package creational.factoryMethod.ShapeDemo;

public class ShapeFactory {
	
	Shape getShape(String input) {
		switch (input) {
		case "CIRCLE": {
			return new Circle();
		}
		case "RECTANGLE": {
			return new Rectangle();
		}
		default:
			break;
		}
		return null;
	}

}
