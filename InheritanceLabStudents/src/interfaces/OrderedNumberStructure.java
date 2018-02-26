package interfaces;

import exceptions.InvalidIndexException;
import orderedStructures.Geometric;


public interface OrderedNumberStructure {
	double getTerm(int n) throws InvalidIndexException; 
	void printAllTerms(int n);
}
