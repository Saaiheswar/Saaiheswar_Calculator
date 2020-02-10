package org.DesignPrinciples;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1,num2;
        boolean b = true;
        char ch,c;
        Operation o=new Operation();
        while(b) {
            System.out.println("Enter the first number:");
            num1=s.nextInt();
            System.out.println("Enter the second number:");
            num2=s.nextInt();
            System.out.println("Choose the operation you want to perform:)");
            System.out.println("###   +   ###\n###   -   ###\n###   *   ###\n###   /   ###");
            ch=s.next().charAt(0);
            if(ch == '+') {
                o.add(num1, num2);
            }
            else if(ch == '-') {
                o.sub(num1, num2);
            }
            else if(ch == '*') {
                o.mul(num1, num2);
            }
            else if(ch == '/') {
                o.div(num1, num2);
            }
            else {
                System.out.println("Invalid operation");
            }
            System.out.println("Do you want to perform another operation(y/n)");
            c=s.next().charAt(0);
            if(c!='y') {
                b=false;
            }
        }
    }
}
