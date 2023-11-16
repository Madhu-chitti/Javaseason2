package oct2nd;

import java.util.Scanner;

public class OperatorDemo6 {

	public static void main(String[] args) {
		
		System.out.println("enter some  value for x ");
		
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println(x>=0?"+ve":"-ve");
		
		if(x>=0)
		{
			System.out.println("+ve");
			
		}
		else
		{
			System.out.println("-ve");
		}
		
		System.out.println("end of program");

	}

}
