import java.lang.*;
import java.util.*;
public class Swap_Two_Nums
{
	public static void main(String[] args)
	{
	  int No1 = 0, No2 = 0 , Temp = 0;
	  
	  Scanner S = new Scanner(System.in);
	  
	  System.out.print("\n Enter 1st Number : ");
	  No1 = S.nextInt();
	  System.out.print("\n Enter 2nd Number : ");
	  No2 = S.nextInt();
	  
	  
	 System.out.println("\n Before Swapping => " );
	 System.out.println("\n 1st Number = " + No1 );
	 System.out.println("\n 2nd Number = " + No2 );
	 
	 /// Logic for swapping
	 
	 Temp = No1;
	 No1 = No2;
	 No2 = Temp;
	 
	 System.out.println("\n After Swapping => " );
	 System.out.println("\n 1st Number = " + No1 );
	 System.out.println("\n 2nd Number = " + No2 );
	}
}
	 
	 