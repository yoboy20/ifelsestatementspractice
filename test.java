/* A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not. Modify the above question to allow student to sit if he/she has medical 
cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly. */

public class test{
  public static void main(int held,int attend,int medical){
    int a= (attend*100)/held;
    if(a>=75){
      System.out.println("You can sit in exams");
    }
    else if(medical=='Y'){
      System.out.println("You are allowed to sit in exams due to medical reasons");
    }
    else if(medical=='N'){
       System.out.println("You are not allowed to sit in exams");
    }
    else{
      System.out.println("You are not allowed to sit in exams");
    }
  }
}