import java.util.*;

//Print the number of 7s that are in the 2D Array

public class Array2D1{
    public static void main(String args[]){
        int array[][]={{4,7,8},{8,8,7}};
        int key = 7;
        int counter = 0;
        for(int i=0;i<array.length;i++){
            for(int j =0;j<array[0].length;j++){
                if(key==array[i][j]){
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}