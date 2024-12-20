import java.util.*;

public class StringBuilder1{
    public static void main (String args[]){
        StringBuilder sb = new StringBuilder("Hello");

        String Builder yes = new StringBuilder("wahh");
        yes.toString();
        
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'B');
        System.out.println(sb);

        sb.insert(0, 'S');
        System.out.println(sb);

        sb.delete(2, 4); //ending index not included
        System.out.println(sb);

        sb.append("e"); //adds in end 
        sb.append("f");

        System.out.println(sb);
        System.out.println(sb.length());
    }
}