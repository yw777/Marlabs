package Assignment20200610;

// Assignment 20200610 - Q2

class A {
	
	int instanceVar1 = 1;
	int instanceVar2 = 2;
	
	public A() {
		System.out.println("Default Constructor");
	}
	
	public A(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
	
	public void method(int a, int b, int c, int d) {
		System.out.println(a + " " + b + " " + c + " " + d);
	}
}

public class B {
	public static void main(String[] args) {
		A obj = new A();
		A obj1 = new A(10, 11, 12);
		A obj2 = new A();
		
		obj.method(100, 200, 300, 400);
		
		obj2.instanceVar2 = 500;
		System.out.println(obj.instanceVar2 + " " + obj2.instanceVar2);
	}
}
