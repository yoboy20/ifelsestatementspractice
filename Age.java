// Take input of age of 3 people by user and determine oldest and youngest among them.
public class Age{
    public static void main(int a,int b,int c){
     if(a>b&&a>c){
        System.out.println("The oldest age"+a);
        }
     else{
        System.out.println("The youngest age"+a);
        }   
     // If b is greater than all of them
     if(b>a&&b>c){
        System.out.println("The oldest age"+b);
        }
     else{
        System.out.println("The youngest age is"+b);
        }
     // If c is greater than all of them
     if(c>a&&c>b){
        System.out.println("The oldest age"+c);
        }
     else{
        System.out.println("The youngest age"+c);
        }    
  }
}