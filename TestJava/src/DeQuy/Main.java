package DeQuy;

import java.util.Scanner;

public class Main {
    public static int ktnt(int a,int i){
        if (i==a) return 1;
        if (a%i==0) return 0;
        return ktnt(a,i+1);
    }

    public static int in(int a){
        if (a<2) return 0;
        if (ktnt(a,2)==1) System.out.print(a+"  ");
        return in(a-1);
    }

    public static int tong(int a,int sum){
        if (a<2) return sum;
        if (ktnt(a,2)==1) return tong(a-1,sum+a);
        return tong(a-1,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập a: ");
        a = sc.nextInt();
        if (ktnt(a,2)==1) System.out.println("Là NT");
            else System.out.println("Không là NT");
        System.out.println("Các số NT nhỏ hơn a: ");
        in(a-1);
        System.out.println();
        System.out.println("Tổng các số NT nhỏ hơn a: "+tong(a-1,0));


    }
}
