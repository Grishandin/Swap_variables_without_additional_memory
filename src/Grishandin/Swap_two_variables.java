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
        b=b-a+b;
        a=(a+b)/2;
        b=(2*a-2*b)/2;
        System.out.print("a: "+ a+" b: "+ b);
    }
}
