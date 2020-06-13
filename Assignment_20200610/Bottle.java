package Assignment20200610;

// Assignment 20200610 - Q5

public class Bottle {

	public static void main(String[] args) {
		Water w = new Water();
		w.taste();
	}
}

class Water{
	public int a;
	public int b;
	public int c;
	
	public void cap() {
		int a = 1;
		int b = 2;
		int c = 3;
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void taste() {
		this.cap();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}