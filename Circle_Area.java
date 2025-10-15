import java.lang.*;
import java.util.*;

public class Circle_Area
{
	public static void main(String[]args)
	{
	  float Rad = 0.0f , Area = 0.0f;
	  final float PI = 3.14f;

	  Scanner S = new Scanner (System.in);
	  
	  System.out.println("Enter Radius of Circle is :");
	  Rad = S.nextFloat();

	  Area = PI*Rad*Rad;

	  System.out.println("\n Area of Circle is " +Area);
	}
}