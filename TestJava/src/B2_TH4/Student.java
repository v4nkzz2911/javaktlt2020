package B2_TH4;

import java.util.Scanner;

public class Student {
    private String ID;
    private String name;
    private float score;

    private Scanner sc = new Scanner(System.in);

    public float getScore() {
        return score;
    }

    public Student() {
        this.ID = "";
        this.name = "";
        this.score = 0;
    }

    public void nhapSV(){
        sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        this.ID = sc.nextLine();
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập điểm: ");
        this.score = sc.nextFloat();
    }

    public void xuatSV(){
        System.out.println(this.ID+"\t"+this.name+"\t"+this.score);
    }


}
