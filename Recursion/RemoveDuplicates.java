//Write a program tp remove duplicate characters from the given string
import java.util.*;
public class RemoveDuplicates{
    public static void main(String args[]){
        Remove("hello", 0, new StringBuilder(""), new boolean[26]);

    }

    public static void Remove(String str, int index, StringBuilder SB, boolean[] map){
        if(index==str.length()){
            System.out.println(SB);
            return;
        }

        char currentChar = str.charAt(index);
        if(map[currentChar-'a']== true){
            Remove(str, index+1, SB, map);
        }
        else{
            map[currentChar-'a'] = true;
            Remove(str, index+1, SB.append(currentChar), map);
        }
    }
}