package Application;

import java.net.SocketPermission;

public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Dog");
		cat1.grow();
		cat1.eat();
		cat1.walk();
		cat1.setAge(3);

		cat2.grow();
		cat2.grow();
		cat2.grow();
		System.out.println(cat2.getAge());

	}
}
