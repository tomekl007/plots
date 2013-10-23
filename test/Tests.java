import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 10/23/13
 * Time: 11:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Tests {

    final Exercise2 exercise2 = new Exercise2();
    @Test
    public void testInput(){
        String[]  args = new String[] {"9", "-5", "0" ,"7" ,"-6" ,"4" ,"3" ,"-5", "0", "2"};
        int[] result = exercise2.parseInput(args);
        int[] expectedOutput = new int[]{-5, 0, 7, -6, 4, 3, -5, 0, 2};
        Assert.assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testRangeMethod(){
        int[] input = new int[]{1, 7, 0, -1, 3};
        Integer[] expectedOutput = new Integer[]{1, 2, 3, 4};
        int step = 1;
        Integer[] result = exercise2.range(step, input);
        Assert.assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testRangeMethod2(){
        int[] profits = new int[] {-5, 0 ,8 ,16 ,34, -103 ,-5, 0, 99};
        Integer[] expectedOutput = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        int step = 1;
        Integer[] result = exercise2.range(step, profits);
        Assert.assertArrayEquals(expectedOutput, result);

    }

    @Test
    public void endToEndTest(){
        String[]  args = new String[] {"9", "-5", "0" ,"7" ,"-6" ,"4" ,"3" ,"-5", "0", "2"};
        Exercise2.main(args);

    }

    @Test
    public void testFindMaxProfitability(){
        int[] profits = new int[] {-5, 0 ,7 ,-6 ,4 ,3 ,-5, 0, 2};
        int[] result = exercise2.findMaxProfitability(profits);
        int[] expectedResult = new int[]{3, 6, 8};
        Assert.assertArrayEquals(expectedResult, result);

    }

    @Test
    public void testFindMaxProfitability2(){
        int[] profits = new int[] {-5, 0 ,8 ,16 ,34, -103 ,-5, 0, 99};
        int[] result = exercise2.findMaxProfitability(profits);
        int[] expectedResult = new int[]{9, 9, 99};
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testTwoSameProfitSeries(){
        int[] profits = new int[] {8, 2, -33, 3, 7};
        int[] result = exercise2.findMaxProfitability(profits);
        int[] expectedResult = new int[]{1, 2 , 10};
        Assert.assertArrayEquals(expectedResult, result);
    }

}
