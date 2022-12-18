import java.util.Scanner;
    public class attendence{
    public static void main(String []args){
        System.out.println("To find the number of leaves you can take by giving  total workings days ");
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the total working days[>>]");
        float  c1=input.nextFloat();
        System.out.print("Please enter minimum  percentage  to find the numbers of days you can leave[>>]");
        float c2=input.nextFloat();
        float final_ans=c1-(c2/100*c1);
        System.out.printf("You can take %d number  of leaves  ",Math.round(final_ans));
//done


        



        }



    }

