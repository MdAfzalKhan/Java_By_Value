package array.test;

public class ByValue {
	
	static int x = 50;

	public static void main(String[] args) {
		
		ByValue objValue = new ByValue();
		
		System.out.println("=====End======");
		add(x);
		System.out.println("After x value in method add : " + x);
		obj(objValue);
		System.out.println("x value assigned by object : " + x);
		
		System.out.println("=====End======");
		
		
	}
	
	static void add(int a) {
		 a =  a + 50;
		 System.out.println("Value of instance variable x inside mehtod: " + a);
		
	}
	
	static void obj(ByValue obj) {
		ByValue objMy = new ByValue();
		objMy.x = x + 250;
		System.out.println("Value of instance variable x inside obj method: " + x);
	}

}





