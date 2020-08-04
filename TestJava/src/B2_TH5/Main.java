package B2_TH5;

import java.util.Scanner;

public class Main {
    static Manager m = new Manager();
    public static void menu(){
        System.out.println("1.Nhập 1 giáo viên");
        System.out.println("2.Nhập 1 nhân viên");
        System.out.println("3.In danh sách");
        System.out.println("4.In danh sách giáo viên và nhân viên theo chiều tăng của lương");
        System.out.println("5.Tìm kiếm thông tin về Giáo viên/Nhân viên khi biết mã nhập từ bàn phím");
        System.out.println("6.Thoát");
        System.out.print("Lựa chọn: ");
    }
    public static void subMenu(){
        System.out.println("1.Tìm trong danh sách Giáo viên");
        System.out.println("2.Tìm trong danh sách Nhân viên");
        System.out.println("3.Thoát");
        System.out.println("Lựa chọn: ");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rep=0,subrep=0;
        while (rep!=6){
            menu();
            rep = sc.nextInt();
            switch (rep){
                case 1 :
                    m.nhap(rep);
                    break;
                case 2 :
                    m.nhap(rep);
                    break;
                case 3 :
                    m.xuat();
                    break;
                case 4 :
                    m.inSort();
                    m.xuat();
                    break;
                case 5 :
                    subMenu();
                    subrep = sc.nextInt();
                    m.search(subrep);
                    break;
            }
        }
    }
}
