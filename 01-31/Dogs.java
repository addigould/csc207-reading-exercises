public class Dog {
	public String color;
	public String size;
	public int age;

	public Dog(String color, String size, int age) {
		this.color = color;
		this.size = size;
		this.age = age;
	}

	public static void bark(Dog dogName) {
		System.out.println(dogName.color);
		System.out.println(dogName.size);
		System.out.println(dogName.age);

	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("brown", "medium", 8);
		bark(dog1);

	}

}
