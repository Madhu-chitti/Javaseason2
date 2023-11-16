package oct7th;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter Dividend:");
		Scanner input = new Scanner(System.in);
		int x=input.nextInt();
		System.out.println("Enter Division :");
		int y=input.nextInt();
		
		//Threed.sleep(3000);
		//new FileInputStream("D:\\abc.text")
		
		try
		{
		System.out.println("Quotient is "+x/y);
		}
		
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter non-zero value for Divisor ...");
			 System.out.println(e.getMessage());
			 e.printStackTrace();
		}
		
		catch(RuntimeException re)
		{
			
		}
		
		
		finally
		{
			System.out.println("this is finally block ");
		}
		
		System.out.println("End of Program");

	}

}
