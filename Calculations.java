import java.util.Scanner;
public class Calculations{
  static int add(int a,int b)
  {
    return a+b;
  }
  static int sub(int a,int b)
  {
    return a-b;
  }
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter your num1");
     int num1=sc.nextInt();
     System.out.println("Enter your num2");
     int num2=sc.nextInt();
     System.out.println("Addition: "+add(num1,num2));
     System.out.println("Subtraction: "+sum(num1,num2));
  }
  }
  
