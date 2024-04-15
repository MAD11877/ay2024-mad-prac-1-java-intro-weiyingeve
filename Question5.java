import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> values = new ArrayList<> ();
    int numbers = in.nextInt();
    while (numbers > 0) {
      int num = in.nextInt();
      values.add(num);
      numbers -= 1;
    }
    /*with help from StackOverflow */
    int count = 0;
    int mode = 0;
    for (int i : values) {
      int x = i;
      int tempCount = 1;

      int y = 0;
      for (int j : values) {
        y = j;
      }
      if (x == y) {
        tempCount++;
      }
      
      if (tempCount > count) {
        count = tempCount;
        mode = x;
      }
    }
  }
}
