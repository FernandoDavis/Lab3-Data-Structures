package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() throws IllegalStateException{
		if(checkFirstValue == false) {
			throw new IllegalStateException("nextValue: First Value has not been invoked");
		}
		double temp = current;
		current += prev;
		prev = temp;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		checkFirstValue = true;
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}

}
