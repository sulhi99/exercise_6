import java.util.Scanner;
public class Average
{
   public static void main (String[]args)
   {
    Scanner sc =new Scanner(System.in);
    System.out.println("Please Enter 3 integers :");
    System.out.print("1st Integer : ");
    int num1=sc.nextInt();
    System.out.print("2nd Integer : ");
    int num2=sc.nextInt();
    System.out.print("3rd Integer : ");
    int num3=sc.nextInt();
    System.out.printf("Average of the 3 integers = %.2f%n", average(num1,num2,num3));
   
    System.out.println("Please add an integer: ");
    System.out.print("4th Integer : ");
    int num4=sc.nextInt();
    System.out.printf("Average of the 4 integers = %.2f%n",average(num1,num2,num3,num4));
   }

   public static double average(int num1,int num2,int num3)
   {
    double avg = ((double)num1+num2+num3)/3;
    return avg;
   }
   
   public static double average(int num1,int num2,int num3,int num4)
   {
    double avg = ((double)num1+num2+num3+num4)/4;
    return avg;
   }
}//end of class