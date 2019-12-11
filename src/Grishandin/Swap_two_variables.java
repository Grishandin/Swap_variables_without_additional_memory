package Grishandin;

import java.util.Scanner;

public class Swap_two_variables {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a:");
        int a =scan.nextInt();
        System.out.print("Type b:");
        int b =scan.nextInt();
        a=b+a;
        b=a-b; //b=a+b-b=a
        a=a-b; //a=a+b-a=b
//        2nd way
//        a=b+a;
//        b=b-a+b; //b=b-b-a+b=b-a
//        a=(a+b)/2; //a=(a+b+b-a)/2=2b/2=b
//        b=(2*a-2*b)/2; //b=(2b-2b+2a)/2=2a/a=a
        System.out.print("a: "+ a+" b: "+ b);
    }
}
