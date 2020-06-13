package Assignment20200610;

//Assignment 20200610 - Q6

class AC {
	public int price = 500;
	
	public int getPrice() {
		return price;
	}
	
	public String getType() {
		return "AC";
	}
}

class FAN extends AC{
	public int price = 100;

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getType() {
		return "FAN";
	}
}

public class Question6{
	public static void main(String[] args) {
		AC ac = new AC();
		FAN f = new FAN();
		
		System.out.println(ac.getPrice());
		System.out.println(ac.getType());
		
		System.out.println(f.getPrice());
		System.out.println(f.getType());
	}
}