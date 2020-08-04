package B1_TH5;

import java.util.Scanner;

public abstract class HinhHoc {
    protected float dai;
    protected float rong;

    public HinhHoc(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public HinhHoc() {
    }


    public void in() {
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

    public abstract void out();

    public void draw() {
        this.dai = Math.round(dai);
        this.rong = Math.round(rong);
        int i, j;
        System.out.println();
        for (i = 1; i <= rong; i++) {
            for (j = 1; j <= dai; j++) System.out.print("* ");
            System.out.println();
        }
    }

    public float getDai() {
        return dai;
    }

    public float getRong() {
        return rong;
    }
}
