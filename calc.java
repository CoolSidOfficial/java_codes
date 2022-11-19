import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class calc {
   public static void main(String[] args){
     System.out.println("This is a basic calculator ,we can do basic arthmetic calculations");
     Scanner inp=new Scanner(System.in);
     String intro="Choose one of the option\n[1>>]Addition \n[2>>]Subtraction\n[3>>]Multiplaction\n[4>>]Division";
     System.out.println(intro);
     int ch1=inp.nextInt();
     System.out.println("Please enter  the first number in which you want to perform calcuation "); 
     int c1=inp.nextInt();
     System.out.println("Please enter the second number in which you want to perform the calcuation");
     int c2=inp.nextInt();



     if (ch1==1){
        System.out.printf("The sum is %d",c1+c2);
     }
    else if (ch1==2){
        System.out.printf("The answer to subtraction is %d",c2-c1);
    }
    else if (ch1==3){
        System.out.printf("The answer to multiplcation is %d",c1*c2);
    }
    else if (ch1==4){
        System.out.printf("The answer to division is %d",c1/c2);
    }
   else{
    System.out.println("You have give wrong input,please run again .");
   }
  }  

}


//done
// 19/11/22