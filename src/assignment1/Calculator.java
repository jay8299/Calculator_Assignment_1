/**
 * 
 */
package assignment1;

/**
 * @author ttiyyagura@teksystems.com
 *
 */
public class Calculator implements CalculatorStructure {
	
	public Calculator(){
		// Empty non parameterized constructor 
	}

	@Override
	public int addition(int dividend, int divisor) {
		// TODO Auto-generated method stub
		return dividend+divisor;
	}

	@Override
	public double addition(int dividend, double divisor) {
		// TODO Auto-generated method stub
		return dividend+divisor;
	}

	@Override
	public double addition(double dividend, int divisor) {
		// TODO Auto-generated method stub
		return dividend+divisor;
	}

	@Override
	public double addition(double dividend, double divisor) {
		// TODO Auto-generated method stub
		return dividend+divisor;
	}

	
	@Override
	public double subtract(int dividend, double divisor) {
		// TODO Auto-generated method stub
		return dividend-divisor;
	}

	@Override
	public int subtract(int dividend, int divisor) {
		// TODO Auto-generated method stub
		return dividend-divisor;
	}
	
	@Override
	public double subtract(double dividend, int divisor) {
		// TODO Auto-generated method stub
		return dividend-divisor;
	}

	@Override
	public double subtract(double dividend, double divisor) {
		// TODO Auto-generated method stub
		return dividend-divisor;
	}
	
	@Override
	public int multiply(int dividend, int divisor) {
		// TODO Auto-generated method stub
		return dividend*divisor;
	}

	@Override
	public double multiply(int dividend, double divisor) {
		// TODO Auto-generated method stub
		return dividend*divisor;
	}

	@Override
	public double multiply(double dividend, int divisor) {
		// TODO Auto-generated method stub
		return  dividend*divisor;
	}

	@Override
	public double multiply(double dividend, double divisor) {
		// TODO Auto-generated method stub
		return dividend*divisor;
	}
	
	@Override
	public int divide(int dividend, int divisor) {
		// TODO Auto-generated method stub
		if (divisor == 0) {
		    throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
		return dividend/divisor;
	}

	@Override
	public double divide(int dividend, double divisor) {
		// TODO Auto-generated method stub
				if (divisor == 0.0) {
				    throw new IllegalArgumentException("Argument 'divisor' is 0");
				}
				return dividend/divisor;
	}

	@Override
	public double divide(double dividend, int divisor) {
		// TODO Auto-generated method stub
				if (divisor == 0) {
				    throw new IllegalArgumentException("Argument 'divisor' is 0");
				}
				return dividend/divisor;
	}

	@Override
	public double divide(double dividend, double divisor) {
		if (divisor == 0.0) {
		    throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
		return dividend/divisor;
	}

}
