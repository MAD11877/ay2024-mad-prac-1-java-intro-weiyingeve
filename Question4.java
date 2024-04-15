import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    int x = i;
    do {
      while (x > 0) {
        System.out.print('*');
        x -= 1;
      }
      System.out.print("\n");

      i -= 1;
    } while (i > 0);
  }
}
