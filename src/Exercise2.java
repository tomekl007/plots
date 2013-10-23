/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 10/23/13
 * Time: 11:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
         int[] profits  = exercise2.parseInput(args);
         int[] result = exercise2.findMaxProfitability(profits);
         printArray(result);
    }

    private static void printArray(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            System.out.print(" ");
        }
        System.out.println();
    }


    public  int[] findMaxProfitability(int[] profits) {
        int maxStart = 0, maxEnd = 0, maxProfit = profits[0];
        int maxPreviousSeriesProfit = profits[0];
        int maxPreviousSeriesStart = 0;

        Integer[] range = range(1, profits);
        for(Integer i : range){
            if(maxPreviousSeriesProfit > 0){
                maxPreviousSeriesProfit += profits[i];
            }else{
                maxPreviousSeriesProfit = profits[i];
                maxPreviousSeriesStart = i;
            }
            if (maxPreviousSeriesProfit > maxProfit) {
                maxProfit = maxPreviousSeriesProfit;
                maxStart = maxPreviousSeriesStart;
                maxEnd = i;
            }

        }

        return new int[]{maxStart+1, maxEnd +1, maxProfit};

    }

    public int[] parseInput(String[] args) {
        int length = Integer.parseInt(args[0]);
        int[] result = new int[length];
        for (int i = 1; i <= length; i++) {
            result[i-1] = Integer.parseInt(args[i]);
        }
        return result;
    }

    public Integer[] range(int step, int[] profits){
        int length = profits.length - 1;
        Integer[] result = new Integer[length];
        for (int i = 0; i < length; i+= step) {
            result[i] = i+1;
        }
        return result;
    }


}
