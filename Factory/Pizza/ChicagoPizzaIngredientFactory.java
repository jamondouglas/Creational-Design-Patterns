package Pizza;

import ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough(){
		return new ThickCrustDough();
	}
	
	public Sauce createSauce(){
		return new PlumTomatoSauce();
	}
	
	public Cheese createCheese(){
		return new Mozzarella();
	}
	
	public Veggies createSpinach(){
		return new Spinach();
	}
	public Veggies createBlackOlives(){
		return new BlackOlives();
	}
	
	public Veggies createEggPlant(){
		return new EggPlant();
	}
	
	public Pepperoni createPepperoni(){
		return new JohnniesPepperonis();
	}
	
	public Clams createClams(){
		return new FrozenClams();
	}

	@Override
	public Veggies[] createVeggies() {
		return null;
	}
}
