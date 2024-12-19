import java.util.*;

public class BitManipulation{
    public static void main(String args[]){

        //AND 0 with anything is 0
        //OR 1 with anything is 1
        //XOR ^ opposites are 1 i.e. 0and 1 = 1 else 0 i.e same 0
        //Ones complement ~
        //LSB - right, MSB - left(pos or negative)
        //2s complement - ones complement +1
        //Binary Left Shift <<           a<<b = a*2raisedto(b)
        //Binary Right Shift >>          a>>b=a/2raisedto(b)

        //GET BIT 
        //ques : 3rd bit (pos 2) of number n = 0101 right to left calc
        //bit mask 1<<i
        //AND
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        if((bitMask & n)==0){
            System.out.println("Bit was 0");
        } else{
            System.out.println("Bit was 1");
        }

        //SET BIT = bit becomes 1
        // bit mask 1<<i
        // OR
        int x = 5;
        int p = 1;
        int bitMa = 1<<p;
        int newNum = bitMa | x;
        System.out.println(newNum);

        //CLEAR BIT makes bit 0
        // bit mask
        //AND with NOT
        int y = 5;
        int z = 2;
        int bitm = 1<<z;
        int notbitm = ~(bitm);
        int newnumber = notbitm &  n;
        System.out.println(newnumber);

        //UPDATE BIT  changes bit
        //for 1 bit mask then and with NOT
        //for 0 bit mask then OR

        Scanner sc = new Scanner(System.in);
       int oper = sc.nextInt();
       // oper=1 -> set; oper=0 -> clear
      int numb = 5;
      int position = 1;
     
      int bitMaskk = 1<<position;
      if(oper == 1) {
          //set
          int newNumberr = bitMaskk | numb;
          System.out.println(newNumberr);
      } else {
       //clear
       int newBitMask = ~(bitMaskk);
       int newNumberr = newBitMask & n;
       System.out.println(newNumberr);
      }
      

        



    }

    
}