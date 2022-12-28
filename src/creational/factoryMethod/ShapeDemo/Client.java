package creational.factoryMethod.ShapeDemo;

public class Client {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();

		for (String shape : new String[] { "CIRCLE", "RECTANGLE" }) {
			Shape shapeObj = factory.getShape(shape);
			shapeObj.draw();
		}

	}

}
