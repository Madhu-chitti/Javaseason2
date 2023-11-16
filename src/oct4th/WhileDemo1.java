package oct4th;

import java.util.Scanner;

public class WhileDemo1 {

	public static void main(String[] args) {
		boolean status=true;
		while(status)
		{
			System.out.println(" Enter sum chrecter");
			Scanner input = new Scanner(System.in);
			char ch=input.next().charAt(0);
			
			if(ch != 'x')
			{
				System.out.println("You have entered " +ch);
			}
			else
			{
				System.out.println("Exiting the loop");
				status=false;
			}
		}

	}

}
