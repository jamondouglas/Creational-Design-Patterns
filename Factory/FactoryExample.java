
public class FactoryExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalFactory afac = new AnimalFactory();
		IAnimal a1 = afac.getAnimal("canine");
		a1.makeSound();
		Cat x = new Cat();

		IAnimal a2 = afac.getAnimal("feline");
		System.out.println("a2 makes this sound "+a2.makeSound());
		System.out.println("a1 makes this sound "+a1.makeSound());
	}

}
