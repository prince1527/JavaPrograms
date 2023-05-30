class Humans{
	void wakeUp1() {
		System.out.println("Average wake up time in USA is 7:20AM");
	}
	
	void wakeUp2(){
		System.out.println("Average wake up time in India is 7:36 AM");
	}
}

class India extends Humans{
	void hindi(){
		System.out.println("Most people speak hindi in India");
	}
}

class USA extends Humans{
	void English() {
	System.out.println("Most people speak English in USA");
	}
}
public class HierarchicalInheritance {
	
	public static void main(String args[]) {
		USA u1 = new USA();
		u1.wakeUp1();
		u1.English();
		
		India i1 = new India();
		i1.wakeUp2();
		i1.hindi();
	}

}
