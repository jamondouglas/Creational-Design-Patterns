package Pizza;

import ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough(){
		return new ThinCrustDough();
	}
	
	public Sauce createSauce(){
		return new MarinaraSauce();
	}
	
	public Cheese createCheese(){
		return new ReggianoCheese();
	}
	
	public Veggies[] createVeggies(){
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}
	
	
	public Clams createClams(){
		return new FreshClams();
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new TawniesPepperoni();
	}
}
