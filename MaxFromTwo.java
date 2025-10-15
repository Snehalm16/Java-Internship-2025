import java.lang.*;
import java.util.*;

public class MaxFromTwo
{
	public static void main(String[] args)
	{
		int No1 = 0, No2 = 0;
		Scanner S = new Scanner (System.in);
		
		System.out.print("\n Enter 1st Number : ");
		No1 = S.nextInt();
		System.out.print("\n Enetr 2nd Number : ");
		No2 = S.nextInt();
		
		if(No1 == No2)
		{
				System.out.println("\n both Numbers are Equal.");
		}
		else if(No1 > No2)
		{
				System.out.println("\n Number " + No1 + " is Maximum.");
		}
		else
		{
				System.out.println("\n Number " + No2 + " is Maximum.");
		}

    System.out.println("\n Thanks.");
    }
}	