
public class Animal2 {
	    public static void main(String[] args) {
	        Dog dog = new Dog("Buddy", 3);
	        Cat cat = new Cat("Whiskers", 5);

	        System.out.println("Dog Name: " + dog.getName());
	        System.out.println("Dog Age: " + dog.getAge());
	        dog.makeSound();

	        System.out.println("Cat Name: " + cat.getName());
	        System.out.println("Cat Age: " + cat.getAge());
	        cat.makeSound();
	    }
	}
