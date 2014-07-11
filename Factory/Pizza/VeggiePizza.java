package Pizza;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	VeggiePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Pepperoni Pizza");
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		//veggies[] = ingredientFactory.createVeggies();
	}
}
