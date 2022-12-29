package structural.decorator.ConceptAndCoding;

public class Main {
	public static void main(String[] args) {
		BasePizza cheeseMargheritaPizza = new ExtraCheese(new Margherita());
		System.out.println("Total cost: " + cheeseMargheritaPizza.cost());
		
		BasePizza mushroomCheeseMargheritaPizza=new ExtraMushroom(new ExtraCheese(new Margherita()));
        System.out.println("Total cost: " + mushroomCheeseMargheritaPizza.cost());
	}
}
