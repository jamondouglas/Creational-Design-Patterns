package Pizza;

import ingredients.Veggies;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type,Veggies[] veggies){
		Pizza pizza = createPizza(type,veggies);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	protected abstract Pizza createPizza(String type,Veggies[] veggies);
}
