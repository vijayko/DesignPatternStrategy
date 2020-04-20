import java.util.Collections;
import java.util.List;
/**
 * 
 * @author vijay
 *
 */

/**
 * 
 * ComputeMedian is a class implemented on GradeStrategy interface which overrides the method compute to
 * calculate the median of the list provided. 
 *
 */
public class ComputeMedian implements GradeStrategy{
	int median;
	@Override
	/**
	 * @param grades where grades is a List<Integer> object.
	 * @return integer value of the median of the grades in the list. 
	 * @throws EmptyListException if the list is empty. 
	 */
	public int compute(List<Integer> grades) throws EmptyListException {
		if (grades.isEmpty()) {
			  throw new EmptyListException("The list is empty!");
		  }
		  Collections.sort(grades);
		  int len = grades.size();
		  if (grades.size() % 2 == 0)
			  median = (grades.get(len/2) + grades.get(len/2-1))/2;
		  else
		      median = grades.get(len/2);
//		  System.out.println(median);
		  return median;
	}

}
