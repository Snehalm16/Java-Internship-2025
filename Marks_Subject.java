import java.util.*;
import java.lang.*;
public class Marks_Subject
{
 public static void main(String[]args)
 {
  int Physics = 0,Chemistry = 0,Maths = 0 , Tot = 0;
  float Per = 0.0f;
  
 
  Scanner S = new Scanner(System.in);
  
  System.out.print("\n Enter marks of physics :");
  Physics = S.nextInt();
  
  System.out.print("\n Enetr marks of chemistry :");
  Chemistry = S.nextInt();
 
 System.out.print("\n Enter marks of maths :");
  Maths = S.nextInt();
  
  Tot = Physics + Chemistry + Maths;
  Per = Tot/3;
  
  System.out.println("\n Total Marks = " + Tot + ".");
  System.out.println("\n Percentage = " + Per + ".");
  }
 }