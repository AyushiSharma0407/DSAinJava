import java.util.*;
public class Transpose{
    public static void main(String args[]){
        int arr[][]={{4,7,8},{8,8,7}};
        for(int i=0;i<arr[0].length;i++){
            for(int j = 0; j<arr.length;j++){
                System.out.print(arr[j][i]);
            }
        System.out.println();
        }
    }
}