import java.util.*;

public class FriendsPairing{
    public static void main(String args[]){
        System.out.println(FriendPair(3));
    }

    public static int FriendPair(int n){
        if(n==1||n==2){
            return n;
        }
        return FriendPair(n-1)+(n-1)*FriendPair(n-2);
    }

}
