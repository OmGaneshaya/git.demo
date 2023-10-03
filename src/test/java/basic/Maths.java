package basic;

public class Maths {
	
	public void add(int a, int b) {
		int result = a+b;
		System.out.println("sum of two numbers=" + result);
		
	}

	public void divide(int a, int b) {
		int result = a/b;
		System.out.println("result of division=" + result);
		
	}
	public void threenumbers(int a, int b, int c) {
		int result = a+b-c;
		System.out.println("result of 3 number operation=" + result);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths obj = new Maths();
		obj.add(5, 6);
		obj.divide(40,10);
		obj.threenumber(9,4,2);
	}

}
