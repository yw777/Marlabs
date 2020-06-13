package Assignment20200610;

// Assignment 20200610 - Q4

public class Book {
	int price = 10;
	
	public int getPrice() {
		return price;
	}
	
	public int getPrice(int num) {
		return price * num;
	}
}

class Pen{
	int price = 3;
	
	public int getPrice() {
		return price;
	}
	
	public int getPrice(int num) {
		return price * num;
	}
}

class Pencil{
	int[] Paper = new int[] {300, 400, 500, 600, 700};
}