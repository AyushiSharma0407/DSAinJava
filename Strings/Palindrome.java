import java.util.*;
public class Palindrome{
    public static void main(String args[]){

        String a = "Heh";
        String empty = "";
/*
        for(int i =0; i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                System.out.print("not");
                break;
            }
            else{
                System.out.print("yes");
            }

        }
        //System.out.print("yes");
*/

        for(int j = a.length()-1; j>=0;j--){
            empty += a.charAt(j);
        }
        if(empty.equalsIgnoreCase(a)){
            System.out.println("IS PALINDROME");
        }
    }
}