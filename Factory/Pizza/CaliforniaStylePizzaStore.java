package Pizza;

import ingredients.Veggies;

public class CaliforniaStylePizzaStore extends PizzaStore {
	
	private final String CHEESE="cheese";
	private final String PEPPERONI="pepperoni";
	private final String CLAM="clam";
	private final String VEGGIE="veggie";
	
	public CaliforniaStylePizzaStore(){
		
	}
	@Override
	public Pizza createPizza(String type, Veggies[] veggie) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(type.equalsIgnoreCase(CHEESE)){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName(CHEESE);
		}else if (type.equalsIgnoreCase(PEPPERONI)){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName(PEPPERONI);
		}else if(type.equalsIgnoreCase(CLAM)){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName(CLAM);
		}else if(type.equalsIgnoreCase(VEGGIE)){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName(VEGGIE);
		}
		 return pizza;
	}

}
