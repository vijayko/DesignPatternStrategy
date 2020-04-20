import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author vijay
 *
 */

public class ComputeTest {
	private GradeStrategy avgTest, avgWithoutLowestTwoTest, medianTest;
	
	@Before
	public void setUp() throws Exception{
		
		avgTest = new ComputeAvg();
		avgWithoutLowestTwoTest = new ComputeAvgWithoutLowestTwo();
		medianTest = new ComputeMedian();
		
	}
/**
 * Testing the methods implemented in ComputeAvg, ComputeAvgWithoutLowestTwo, and ComputeMedian classes.
 * @throws EmptyListException
 */
	@Test
	public void testComputeAvgMethod() throws EmptyListException {
		List<Integer> grades; 
		grades = Arrays.asList(0, 85, 74, 76, 1, 45, 99, 12, 7, 56, 29, 42, 36, 87, 22, 86, 71, 32, 20, 73, 46, 38);
		assertEquals(47, avgTest.compute(grades));
		grades = Arrays.asList(33, 74, 14, 77, 6, 71, 51, 18, 52, 68, 4, 78);
		assertEquals(45, avgTest.compute(grades));
		
		grades = Arrays.asList(81, 37, 25, 11, 44, 97, 36, 89, 67, 24, 6, 22, 53, 42, 30, 28, 98, 0, 94);
		assertEquals(46, avgTest.compute(grades));
		
		grades = Arrays.asList(70, 26, 47, 69, 88, 46, 20, 79, 29, 12);
		assertEquals(48, avgTest.compute(grades));
		
		grades = Arrays.asList(34, 46, 31, 88, 11, 48, 38, 92, 95);
		assertEquals(53, avgTest.compute(grades));
		
		grades = Arrays.asList(79, 94, 0, 76, 30, 90, 55, 80, 99, 68, 25, 8, 71, 92, 14, 51, 4, 31, 54, 38);
		assertEquals(52, avgTest.compute(grades));
		
		grades = Arrays.asList(10, 68, 30, 26, 70);
		assertEquals(40, avgTest.compute(grades));
		
		grades = Arrays.asList(99, 17, 50, 75, 25, 51, 82, 47);
		assertEquals(55, avgTest.compute(grades));
		
		grades = Arrays.asList(31, 10, 12, 78, 54, 19, 72, 61, 90, 56, 0, 26);
		assertEquals(42, avgTest.compute(grades));
		
		grades = Arrays.asList(0, 0, 0, 0, 0, 0, 0);
		assertEquals(0, avgTest.compute(grades));
		
//		grades = Arrays.asList();
//		assertEquals(47, avgTest.compute(grades));
		
	}
	
	@Test
	public void testComputeAvgWithoutTwoLowestMethod() throws EmptyListException{
		List<Integer> grades;
		grades = Arrays.asList(0, 85, 74, 76, 1, 45, 99, 12, 7, 56, 29, 42, 36, 87, 22, 86, 71, 32, 20, 73, 46, 38);
		assertEquals(51, avgWithoutLowestTwoTest.compute(grades));
		
		grades = Arrays.asList(33, 74, 14, 77, 6, 71, 51, 18, 52, 68, 4, 78);
		assertEquals(53, avgWithoutLowestTwoTest.compute(grades));
		
		grades = Arrays.asList(81, 37, 25, 11, 44, 97, 36, 89, 67, 24, 6, 22, 53, 42, 30, 28, 98, 0, 94);
		assertEquals(51, avgWithoutLowestTwoTest.compute(grades));
		
		grades = Arrays.asList(70, 26, 47, 69, 88, 46, 20, 79, 29, 12);
		assertEquals(56, avgWithoutLowestTwoTest.compute(grades));
		
		grades = Arrays.asList(34, 46, 31, 88, 11, 48, 38, 92, 95);
		assertEquals(63, avgWithoutLowestTwoTest.compute(grades));
		
		grades = Arrays.asList(79, 94, 0, 76, 30, 90, 55, 80, 99, 68, 25, 8, 71, 92, 14, 51, 4, 31, 54, 38);
		assertEquals(58, avgWithoutLowestTwoTest.compute(grades));
		
		grades = Arrays.asList(10, 68, 30, 26, 70);
		assertEquals(56, avgWithoutLowestTwoTest.compute(grades));
		
		grades = Arrays.asList(99, 17, 50, 75, 25, 51, 82, 47);
		assertEquals(67, avgWithoutLowestTwoTest.compute(grades));
		
		grades = Arrays.asList(31, 10, 12, 78, 54, 19, 72, 61, 90, 56, 0, 26);
		assertEquals(49, avgWithoutLowestTwoTest.compute(grades));
	}
	
	@Test
	public void testComputeAvgMedianMethod() throws EmptyListException{
		List<Integer> grades;
		grades = Arrays.asList(0, 85, 74, 76, 1, 45, 99, 12, 7, 56, 29, 42, 36, 87, 22, 86, 71, 32, 20, 73, 46, 38);
		assertEquals(43, medianTest.compute(grades));
		
		grades = Arrays.asList(33, 74, 14, 77, 6, 71, 51, 18, 52, 68, 4, 78);
		assertEquals(51, medianTest.compute(grades));
		
		grades = Arrays.asList(81, 37, 25, 11, 44, 97, 36, 89, 67, 24, 6, 22, 53, 42, 30, 28, 98, 0, 94);
		assertEquals(37, medianTest.compute(grades));
		
		grades = Arrays.asList(70, 26, 47, 69, 88, 46, 20, 79, 29, 12);
		assertEquals(46, medianTest.compute(grades));
		
		grades = Arrays.asList(34, 46, 31, 88, 11, 48, 38, 92, 95);
		assertEquals(46, medianTest.compute(grades));
		
		grades = Arrays.asList(79, 94, 0, 76, 30, 90, 55, 80, 99, 68, 25, 8, 71, 92, 14, 51, 4, 31, 54, 38);
		assertEquals(54, medianTest.compute(grades));
		
		grades = Arrays.asList(10, 68, 30, 26, 70);
		assertEquals(30, medianTest.compute(grades));
		
		grades = Arrays.asList(99, 17, 50, 75, 25, 51, 82, 47);
		assertEquals(50, medianTest.compute(grades));
		
		grades = Arrays.asList(31, 10, 12, 78, 54, 19, 72, 61, 90, 56, 0, 26);
		assertEquals(42, medianTest.compute(grades));
	}
	
	/**
	 * Testing for exceptions. 
	 * @throws EmptyListException
	 */
	@Test(expected = EmptyListException.class)
	public void testExceptionIsThrown() throws EmptyListException {
		List<Integer> grades;
		grades = Arrays.asList();
		avgTest.compute(grades);
		avgWithoutLowestTwoTest.compute(grades);
		medianTest.compute(grades);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrownAgain() throws EmptyListException {
		List<Integer> grades;
		grades = Arrays.asList(1);
//		avgTest.compute(grades);
//		avgTest.compute_median(grades);
		avgWithoutLowestTwoTest.compute(grades);
	}
}
