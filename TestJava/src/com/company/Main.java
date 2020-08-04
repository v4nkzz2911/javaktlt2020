package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n;
        String s;
        System.out.print("Hello World!");
        System.out.println("Hello 2");
        System.out.println("Nhập n: ");
        n=a.nextInt();
        System.out.println("N= "+n);
        System.out.println("Nhập s: ");
        a.nextLine();
        s=a.nextLine();
        System.out.println("S= "+s);
    }
}
