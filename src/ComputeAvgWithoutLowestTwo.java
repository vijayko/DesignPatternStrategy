import java.util.List;
/**
 * 
 * @author vijay
 *
 */

/**
 * 
 * ComputeAvgWithoutLowestTwo is a class implemented on GradeStrategy interface which overrides the method compute to
 * calculate the average of the list provided dropping the lowest two grades. 
 *
 */
public class ComputeAvgWithoutLowestTwo implements GradeStrategy{
	int new_avg;
	@Override
	/**
	 * @param grades where grades is a List<Integer> object.
	 * @return integer value of the average of the grades in the list dropping the lowest two.
	 * @throws EmptyListException if the list is empty. 
	 */
	public int compute(List<Integer> grades) throws EmptyListException {
		int total = 0;
		  if (grades.isEmpty()) {
			  throw new EmptyListException("The list is empty!");
		  }
		  int arr_size = grades.size();

	    if (arr_size < 2){
	    	throw new IllegalArgumentException("There must be two items in the list.");
	    }

	    int first, second; 
	    first = second = Integer.MAX_VALUE;
	    for(Integer grade : grades){
	      if (grade < first){
	        second = first; 
	        first = grade;
	      }

	      else if (grade < second ){
	        second = grade;
	      }
	      total += grade;
	    }
	    int new_total = total - first - second;
//	    System.out.println(new_total);
	    new_avg = new_total / (arr_size - 2);
//	    System.out.println(new_avg);
	    return new_avg;
	  }

}
