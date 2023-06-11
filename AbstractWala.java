
abstract class A{
	public final void callme() {
		System.out.println("Hi");
	}
	
	abstract void hello();
	
	void showme() {
		System.out.println("I am non abstract method of abstract base class");
	}
	
}


class Abs extends A{
	void hello() {
		System.out.println("Hello I am from Abs");
	}
}


class Bb extends A{
	void hello() {
		System.out.println("hello friends I am from Bb class");
	}
}
public class AbstractWala {
	public static void main(String[] args) {
		/*Abs abs = new Abs(); 
		abs.callme();
		
		abs.hello();
		abs.showme();
		
		
		Bb bb = new Bb();
		bb.callme();
		bb.showme();
		bb.hello();*/
		
		
		A a1 = new Abs();
		a1.hello();
		
		a1 = new Bb();
		a1.hello();
		
	}

}
