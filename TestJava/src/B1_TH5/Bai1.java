package B1_TH5;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        HinhHoc hh = new HinhHoc() {
            @Override
            public void out() {

            }
        };
        hh.in();
        if (hh.getDai()==hh.getRong()){
            hh = new HV(hh.getDai(),hh.getRong());
        }
        else hh = new HCN(hh.getDai(),hh.getRong());
        hh.out();
        hh.draw();
    }
}
