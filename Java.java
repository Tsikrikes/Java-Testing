package Java;
import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		Scanner tsik = new Scanner(System.in);
		
		int i,j,x,t;
		System.out.print("Give line number : ");
		x = tsik.nextInt();
		System.out.println("The lines are : " +x);
		
		for(i=1; i<=x; i++)
		{
			System.out.println();
			for(j=1; j<=x-i; j++)
			{
				System.out.print(" ");
			}			
			for(t=1; t<=i*2-1; t++)
			{
				System.out.print("*");
			}	
		}

	}

}
