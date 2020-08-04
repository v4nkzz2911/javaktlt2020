package B2_TH5;

import java.util.Scanner;

public class NhanVien extends ConNguoi {
    protected String room;
    protected String position;
    protected double benefit;

    public NhanVien(String name, String birthday, String sex, double salary, double rate, int basesalary) {
        super(name, birthday, sex, salary, rate, basesalary);
    }

    public NhanVien(String name, String birthday, String sex, double salary, double rate, int basesalary, String room, String position, double benefit) {
        super(name, birthday, sex, salary, rate, basesalary);
        this.room = room;
        this.position = position;
        this.benefit = benefit;
    }

    @Override
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Nhập phòng : ");
        this.room = sc.nextLine();
        System.out.println("Nhập chức vụ: ");
        this.position = sc.nextLine();

    }

    @Override
    public void calcSalary(){
        switch (this.position){
            case "GĐ" :
                this.benefit = 0.4;
                break;
            case "PGĐ" :
                this.benefit = 0.3;
                break;
            case "TP":
                this.benefit = 0.25;
                break;
            case "PP":
                this.benefit = 0.2;
                break;
            case "NV":
                this.benefit = 0.15;
                break;
        }
        this.salary = this.basesalary * (this.rate+ this.benefit);
    }

    @Override
    public int isNV(){
        return 1;
    }

    @Override
    public int isGV(){
        return 0;
    }

    @Override
    public void outputInfo(){
        super.outputInfo();
        System.out.println("Phòng: "+this.room);
        System.out.println("Chức vụ: "+this.position);
    }

    public String getRoom() {
        return room;
    }

    public String getPosition() {
        return position;
    }

    public double getBenefit() {
        return benefit;
    }
}
