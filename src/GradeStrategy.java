import java.util.*;
/**
 * 
 * @author vijay
 *
 */

/**
 * 
 * GradeStrategy is the interface for the strategy pattern for grade calculation. 
 *
 */
public interface GradeStrategy {
	/**
	 * compute takes a List with Integer type 
	 * @param grades
	 * @return integer value of the average of the grades in a list. 
	 * @throws EmptyListException if the list is empty. 
	 */
	public int compute(List<Integer> grades) throws EmptyListException;
}
