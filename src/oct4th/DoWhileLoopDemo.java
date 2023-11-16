package oct4th;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		int x=0;
		
		do
		{
			System.out.println("How many point you got in the game");
			Scanner input=new Scanner(System.in);
			x=input.nextInt();
			if(x!=0)
				System.out.println("You have one more chnace");
			else
				System.out.println("No more chance");
		}while(x>0);

	}

}
