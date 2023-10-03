package basic;

public class Maths {
	
	public void add(int a, int b) {
		int result = a+b;
		System.out.println("sum of two numbers=" + result);
		
	}
	public void sub(int a, int b) {
		int result = a-b;
		System.out.println("Difference of two numbers=" + result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths obj = new Maths();
		obj.add(5, 6);
		obj.sub(30, 20);
	}

}
