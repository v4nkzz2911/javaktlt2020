package com.company;

import java.util.Scanner;

public class Bai1 {
    public static int gt(int a){
        if (a==0) return 1;
        else return a*gt(a-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=sc.nextInt();
        int i,s=0;
        for (i=1;i<=n;i++){
            s=s+gt(i);
        }
        System.out.println("S="+s);
    }
}
