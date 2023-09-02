import java.util.*;

public class Binarytodecimal{

    public static void binToDecimal(int binNum){

        int pow=0, MyNum=binNum;

        int decNum=0;

        while(binNum>0){

            int lastdigit=binNum%10;

            decNum=decNum+(lastdigit*(int)Math.pow(2, pow));

            pow++;

            binNum=binNum/10;

        }

        System.out.println("Decimal of "+MyNum+"= "+decNum);

    }

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the the number -> ");

        int n=sc.nextInt();

        binToDecimal(n);
        
    }

}