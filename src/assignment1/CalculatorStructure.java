/**
 * 
 */
package assignment1;

/**
 * @author 
 *
 */
public interface CalculatorStructure {

	public int addition(int dividend, int divisor);
	public double addition(int dividend, double divisor);
	public double addition(double dividend, int divisor);
	public double addition(double dividend, double divisor);
	
	
	public int subtract(int dividend, int divisor);
	public double subtract(int dividend, double divisor);
	public double subtract(double dividend, int divisor);
	public double subtract(double dividend, double divisor);
	
	
	public int multiply(int dividend, int divisor);
	public double multiply(int dividend, double divisor);
	public double multiply(double dividend, int divisor);
	public double multiply(double dividend, double divisor);
	
	public int divide(int dividend, int divisor);
	public double divide(int dividend, double divisor);
	public double divide(double dividend, int divisor);
	public double divide(double dividend, double divisor);
	
}
