import java.util.*;
/**
 * 
 * @author vijay
 *
 */

/**
 * 
 * ComputeAvgWithoutLowestTwo is a class implemented on GradeStrategy interface which overrides the method compute to
 * calculate the average of the list. 
 *
 */
public class ComputeAvg implements GradeStrategy{
  int raw_avg;
  /**
	 * @param grades where grades is a List<Integer> object.
	 * @return integer value of the average of the grades in the list. 
	 * @throws EmptyListException if the list is empty. 
	 */
  @Override
  public int compute(List<Integer> grades) throws EmptyListException {
    int sum = 0;
    if (!grades.isEmpty()){
      for (Integer grade : grades){
        sum += grade;
      }
      raw_avg = sum / grades.size();
      return raw_avg;
    }
    else {
    	throw new EmptyListException("The list is empty!");
    }
    
  }
}