package Pizza;
import ingredients.*;

import java.util.*;


public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Veggies[] veggies;
	Clams clams;
	Pepperoni pepperoni;
	
	
	abstract void prepare();

//	public void prepare() {
//		System.out.println("Preparing "+name);
//		System.out.println("Tossing Dough..");
//		System.out.println("Adding sauce..");
//		System.out.println("Adding toppings:");
//		for(int i = 0; i<toppings.size();i++){
//			System.out.println(" "+ toppings.get(i));
//		}
//	}
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box() {
		System.out.println("Place pizza in official PizzaStore");
	}
	public String getName(){
		return name;
	}
	
	void setName(String name){
		this.name = name;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clams != null) {
			result.append(clams);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
