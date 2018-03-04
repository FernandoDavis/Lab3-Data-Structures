package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		if(checkFirstValue == false) {
			throw new IllegalStateException("nextValue: First Value has not been invoked");
		}
		current = current * commonFactor; 
		return current;
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue() * Math.pow(this.commonFactor, n-1);
		return value; 
	}

	public String toString() {
		return "Geom (" + (int) super.getTerm(1) + ", " + (int) commonFactor + ")";
	}

}
