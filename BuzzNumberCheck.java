//Program for checking weather the value enterd is buzz no. or not
import java.util.*;
public class BuzzNumberCheck
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);// Scanner
        System.out.println("Enter the number to be checked.");
        int num=ob.nextInt();
        if(num%10==7 || num%7==0) //A buzz no. means that it should end by 7 or can be divided by 7
        {
            System.out.println(num+" is a Buzz Number.");
        }
        else
        {
            System.out.println(num+" is not a Buzz Number.");
        }
    }
}