package orderedStructures;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable {
	
	private double commonDifference; 
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(checkFirstValue == false) {
			throw new IllegalStateException("nextValue: First Value has not been invoked");
		}
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		double value = (this.firstValue() + (n-1) * this.commonDifference); 
		return value; 
	}
	
	public Progression add(Progression p) {
		Arithmetic p2 = (Arithmetic) p;
		return (new Arithmetic(this.firstValue() + p2.firstValue(), this.commonDifference + p2.commonDifference));
	}
	
	public String toString() {
		return "Arith (" + (int) super.getTerm(1) + ", " + (int) commonDifference + ")";
	}
}
