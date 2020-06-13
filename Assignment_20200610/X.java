package Assignment20200610;

// Assignment 20200610 - Q3

public class X {
	public static int a = 2;
	
	public static void main(String[] args) {
		Y y = new Y();
		System.out.println(a * y.b);
	}
}

class Y{
	public static int b = 5;
	
	public static void main(String[] args) {
		X x = new X();
		System.out.println(x.a * b);
	}
}