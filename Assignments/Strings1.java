import java.util.*;
//Count how many times lowercase vowels occurred in a String entered by user
public class Strings1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int count = 0;

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("The no of vowels are:"+ count);
    }
}