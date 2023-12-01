package learnjava;

class Animal1 {
	void walking() {
		System.out.println("I am walking");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("Dog is barking");
	}
}

class BabyDog extends Dog1{
	void cry() {
		System.out.println("Baby Dog is barking");
	}
}

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog bd = new BabyDog();
		bd.walking();
		bd.bark();
		bd.cry();

	}

}
