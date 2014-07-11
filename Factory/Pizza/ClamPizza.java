package Pizza;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing "+name);
		dough = ingredientFactory.createDough();
		cheese = ingredientFactory.createCheese();
		sauce = ingredientFactory.createSauce();
		clams = ingredientFactory.createClams();
	}
	
	
}
