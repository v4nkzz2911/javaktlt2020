package B1_TH5;

import java.util.Scanner;

public class Bai1 {
    public static void menu(){
        System.out.println("1.Tạo hình vuông");
        System.out.println("2.Tạo hình chữ nhật");
        System.out.println("3.Thoát");
        System.out.print("Lựa chọn: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhHoc hh ;
        int rep=0;
        while (rep!=3){
            menu();
            rep = sc.nextInt();
            switch (rep){
                case 1 :
                    hh = new HV();
                    hh.in();
                    hh.out();
                    hh.draw();
                    break;
                case 2 :
                    hh = new HCN();
                    hh.in();
                    hh.out();
                    hh.draw();
                    break;
            }
        }

    }
}
