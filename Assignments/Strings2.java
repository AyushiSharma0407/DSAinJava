import java.util.*;
public class Strings2{
    public static void main(String args[]){
        /*
        String str =  "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1)+" "+ str.equals(str2));

        String stri  = "Hello".replace("l", "");
        System.out.println(stri);
        */

       //Anagrams
       //two words can have letters jumbled to make each other
       String s1 = "race";
       String s2 = "care";
       Anagrams(s1, s2);

       if(isAnagram(s1, s2)){
        System.out.println("wowww");
       }


    }

    public static void Anagrams(String s1, String s2){
        int count=0;
        char String1[] = new char[s1.length()];
        char String2[] = new char[s2.length()];

        if(s1.length()==s2.length()){
            for(int i =0; i<s1.length();i++){
            String1[i] =s1.charAt(i);
            String2[i] =s2.charAt(i);
            }

            Arrays.sort(String1);
            Arrays.sort(String2);

            for(int j=0;j<String1.length;j++){
                if(String1[j]==String2[j]){
                    count++;
                }
            }

            if(count==String1.length){
                System.out.println("ANAGRAMMMMMM");
            } else{
                System.out.println("not it.");

            }

        } else{
            System.out.println("not it.");
        }

        

    }

    public static boolean isAnagram(String s1, String s2){
        char[] string1 = s1.toLowerCase().toCharArray();
        char[] string2 = s2.toLowerCase().toCharArray();
         
        if(s1.length()!=s2.length()){
            return false;
        }

        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);

    }
}