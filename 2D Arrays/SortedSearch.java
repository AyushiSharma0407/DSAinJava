import java.util.*;
public class SortedSearch{

    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}};
        int key = 33;

        staircaseSearch(matrix, key);
        BottomstaircaseSearch(matrix, key);
    }

    public static boolean staircaseSearch(int matrix[][], int key){
        //O(n+m)
        //top right
        int row=0;
        int col = matrix.length-1;

        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("Key at "+row+","+col);
                return  true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else if(key>matrix[row][col]){
                row++;
            }

        }
        System.out.println("Key not found");
        return false;

    }

    public static boolean BottomstaircaseSearch(int matrix[][], int key){
        //O(n+m)
        //bottom left
        int col=0;
        int row = matrix.length-1;

        while(col<matrix.length && row>=0){
            if(key==matrix[row][col]){
                System.out.println("Key at "+row+","+col);
                return  true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else if(key>matrix[row][col]){
                col++;
            }

        }
        System.out.println("Key not found");
        return false;

    }

}