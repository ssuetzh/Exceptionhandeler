package lab12;
import java.util.*;
public class Task2 
{
	public static void main(String[] args) 
	{
	int a = 0, b = 0;
  Scanner input = new Scanner(System.in);
 System.out.println("Enter First Number");
  try {
      a = input.nextInt();
      b = input.nextInt();
  } catch (Exception e) {
      System.out.println(e);
  }
  try {
      int c = a / b;
      System.out.println(c);
  } catch (ArithmeticException e) {
      System.out.println(e);
  }
	}
}