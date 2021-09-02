package com.bdlz.LCCM;

import java.util.Scanner;

public class LineCompByClass {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Computation program by class method");
        lengthOfLine();
    }
    public static void lengthOfLine() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x1 co-ordinate of line: ");
        int x1 = s.nextInt();
        System.out.println("Enter y1 co-ordinate of line: ");
        int y1 = s.nextInt();
        System.out.println("Enter x2 co-ordinate of line: ");
        int x2 = s.nextInt();
        System.out.println("Enter y2 co-ordinate of  line: ");
        int y2 = s.nextInt();
        s.close();
        double length_of_Firstline = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("length of Line1: " + length_of_Firstline);
    }
}
