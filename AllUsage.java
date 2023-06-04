import java.math.*;
class BiCycle1{
	protected int speed;
	protected int gear;
	protected int id=0;
	protected static int noOfBicycles = 0;
	
	BiCycle1(){
		System.out.println("This is Bicycle");
	}
	
	BiCycle1(int g, int s){
		this.gear = g;
		this.speed = s;
		this.id = ++noOfBicycles;
		
	}
	
	public static int getCount() {
		return noOfBicycles;
	}
	
	public int getBikeId() {
		return id;
	}
	
	
	
}

class Hero extends BiCycle1{
	String bmodel;
	Hero(String bmodel){
		super(5,35);
		this.bmodel = bmodel;
		
	}
	
	
}
public class AllUsage {
	public static void main(String[] args) {
		BiCycle1 b1 = new BiCycle1(5,20);
		Hero h1= new Hero("Super");
		System.out.println(BiCycle1.getCount());
		System.out.println("Bike ID::"+b1.getBikeId());
		System.out.println("Bike ID for Hero::"+h1.getBikeId());
		Hero h2 = new Hero("Xtreme");
		System.out.println(b1);
		System.out.println(h1);
		System.out.println(h2);
	}

}
