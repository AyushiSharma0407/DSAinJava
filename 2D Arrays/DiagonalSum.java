import java.util.*;
public class DiagonalSum{
    public static void main(String args[]){
        int arr[][]={{1, 2,3, 4},{5,6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
        System.out.println(Diagonal(arr));
        System.out.println(linearDiagonal(arr));


    }

    public static int Diagonal(int matrix[][]){
        //O(n2)
        int sum =0;

        for(int i=0;i<matrix.length;i++){
            for(int j =0; j<matrix[0].length;j++){
                if(i==j){
                    sum+= matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int linearDiagonal(int matrix[][]){
        //O(n)
        int sum = 0;
        for(int i=0; i<matrix.length;i++){
            sum+= matrix[i][i];

            if(i != matrix.length-1-i){
                //i+j = n-1
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
}