//Q=1 implements the single inheritance 

class Dog{
	void bark(){
		System.out.println("Barking..");
	}
}
class Cat{
	void meow(){
		System.out.println("meowinggg..");
	}
}
class Panda extends Cat{
	void sleep(){
		System.out.println("sleeping..");
	}
}
class Main{
	public static void main(String[] a){
		//Dog dog = new Dog();
		Cat cat = new Cat();
		//cat.bark();
		cat.meow();
		Panda panda = new Panda();
		panda.meow();
		panda.sleep();
	}
}