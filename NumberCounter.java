import java.util.*;

public class NumberCounter{
    public static void main(String args[]){
        int positive=0;
        int negative=0;
        int zero=0;
        String choice = "yes";
        
        while(choice.equals("yes")){
            Scanner sc= new Scanner(System.in);
            System.out.println("Do you want to enter a number");
            choice = sc.next();

            if(choice.equals("yes")){
            System.out.println("Enter number");
            int num = sc.nextInt();
            if(num>0){
                positive++;
            }
            else if(num==0){
                zero++;
            }
            else if(num<0){
                negative++;
            }
            }
        }
        System.out.println("No. of positive integers entered: "+ positive);
        System.out.println("No. of negative integers entered: "+negative);
        System.out.println("No. of pzeroes entered: "+zero);
        
    }
}
