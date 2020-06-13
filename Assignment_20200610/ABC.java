package Assignment20200610;

// Assignment 20200610 - Q1

public class ABC {
	
	int instanceVar = 100;
	
	public ABC(int n) {
		this.instanceVar = n;
	}
	
	public void method() {
		int localVar = 200;
	}
	
	public static void main(String[] args) {
		ABC i1 = new ABC(1);
		System.out.println(i1.instanceVar);
		
		ABC i2 = new ABC(2);
		System.out.println(i2.instanceVar);
		
		ABC i3 = new ABC(3);
		System.out.println(i3.instanceVar);
		
		ABC i4 = new ABC(4);
		System.out.println(i4.instanceVar);
		
	}
}
