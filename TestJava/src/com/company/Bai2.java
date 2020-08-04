package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai2 {
    public static int nt(double a){
        if (a<2) return 0;
        if (a==2) return 1;
        else{
            int i;
            for (i=2;i<=sqrt(a);i++) {
                if (a % i == 0) return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n=sc.nextInt();
        int i,s=0;
        System.out.println("Các số nguyên tố nhỏ hơn n: ");
        for (i=1;i<=n;i++){
            if (nt(i)==1){
                System.out.print(i+"  ");
                s=s+i;
            }
        }
        System.out.println();
        System.out.println("Tổng các số nguyên tố: "+s);
    }
}
