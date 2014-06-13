
public class AnimalFactory {
	public IAnimal getAnimal(String type){
		//IAnimal animal= null;
		if("canine".equalsIgnoreCase(type)){
			return new Dog();
		}else if("feline".equalsIgnoreCase(type)){
			return new Cat();
		}
		return null;
	}
}
