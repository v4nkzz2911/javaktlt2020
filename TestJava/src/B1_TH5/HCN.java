package B1_TH5;

import java.util.Scanner;

public class HCN extends HinhHoc {
    public HCN(float dai, float rong){
        super(dai,rong);
    }

    public HCN() {
    }

    @Override
    public void in(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập chiều dài: ");
            this.dai = sc.nextFloat();
            System.out.println("Nhập chiều rộng: ");
            this.rong = sc.nextFloat();
            if (this.dai < this.rong) {
                System.out.println("Sai rồi! Nhập lại đi!");
            } else return;
        }
    }

    @Override
    public void out(){
        System.out.println("Là hình chữ nhật");
        System.out.println();
        System.out.println("Diện tích: " + this.dai * this.rong);
        System.out.println("Chu vi: " + (this.dai + this.rong) * 2);
    }

    @Override
    public void draw(){
        super.draw();
    }
}
