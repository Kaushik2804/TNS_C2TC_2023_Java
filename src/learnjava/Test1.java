package learnjava;

class A{
	
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello a");
	}
	
	A(int x){
		this();
		System.out.println(x);
	}
	
	void m() {
		System.out.println("Hello m");
	}
	void n() {
		System.out.println("hello n");
		this.m();
	}
}

public class Test1 {
	public static void main(String [] args) {
		A a = new A(10);
		a.n();
	}
}
