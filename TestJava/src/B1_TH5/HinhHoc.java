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


    public abstract void in();

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
