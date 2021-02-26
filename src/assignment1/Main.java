package assignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calsy = new Calculator();
		
		int a=10;
		double b=10.5;
		
		System.out.println("Adding two Integers -> "+calsy.addition(a,a)); 
		System.out.println("Adding an Integer and a double -> "+calsy.addition(a,b)); 
		System.out.println("Adding an Integer and a double -> "+calsy.addition(b,a)); 
		System.out.println("Adding two floats -> "+calsy.addition(b,b)); 

		System.out.println("-------------------------------------------------------");
		System.out.println("subtracting two Integers -> "+calsy.subtract(a,a)); 
		System.out.println("subtracting an Integer and a double -> "+calsy.subtract(a,b)); 
		System.out.println("subtracting an Integer and a double -> "+calsy.subtract(b,a)); 
		System.out.println("subtracting two floats -> "+calsy.subtract(b,b));
		System.out.println("-------------------------------------------------------");

		
		System.out.println("multiplying two Integers -> "+calsy.multiply(a,a)); 
		System.out.println("multiplying an Integer and a double -> "+calsy.multiply(a,b)); 
		System.out.println("multiplying an Integer and a double -> "+calsy.multiply(b,a)); 
		System.out.println("multiplying two floats -> "+calsy.multiply(b,b));
		System.out.println("-------------------------------------------------------");

		System.out.println("dividing two Integers -> "+calsy.divide(a,a)); 
		System.out.println("dividing an Integer and a double -> "+calsy.divide(a,b)); 
		System.out.println("dividing an Integer and a double -> "+calsy.divide(b,a)); 
		System.out.println("dividing two floats -> "+calsy.divide(b,b));
	}

}
