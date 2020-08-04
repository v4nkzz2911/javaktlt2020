package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai3 {
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
        int[] a = new int[100];
        int i,n,max,min,s=0,snt=0;
        System.out.println("Nhập n: ");
        n=sc.nextInt();
        for (i=0;i<n;i++){
            System.out.println("Nhập phần tử thứ "+(i+1)+" : ");
            a[i]=sc.nextInt();

        }
        max=a[0]; min=a[0];s=a[0];
        for(i=1;i<n;i++){
            if (a[i]>max) max=a[i];
            if (a[i]<min) min=a[i];
            s=s+a[i];
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        int j,t;
        for (i=0;i<n-1;i++)
            for (j=1;j<n;j++){
                if (a[i]>a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        System.out.println("Dãy tăng dần: ");
        for (i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
        System.out.println("Dãy giảm dần: ");
        for (i=n-1;i>=0;i--){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
        for (i=0;i<n;i++){
            if (nt(a[i])==1){
                snt=snt+a[i];
            }
        }
        System.out.println("Tổng dãy: "+s);
        System.out.println("Tống các số nguyên tố: "+snt);
    }
}

