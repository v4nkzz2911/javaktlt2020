package B2_TH5;

import java.util.Scanner;

public abstract class ConNguoi {
    protected String name;
    protected String birthday;
    protected String sex;
    protected double salary;
    protected double rate;
    protected int basesalary;

    public ConNguoi(String name, String birthday, String sex, double salary, double rate, int basesalary) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.rate = rate;
        this.basesalary = basesalary;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        this.birthday = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        this.sex = sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        this.basesalary = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập hệ số lương: ");
        this.rate = sc.nextDouble();
        sc.nextLine();
    }
    public void outputInfo(){
        System.out.println("Tên: "+this.name);
        System.out.println("Ngày sinh: "+this.birthday);
        System.out.println("Giới tính: "+this.sex);
        System.out.println("Lương: "+this.salary);
    }
    public abstract void calcSalary();
    public abstract int isGV();
    public abstract int isNV();

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getSex() {
        return sex;
    }

    public double getRate() {
        return rate;
    }

    public int getBasesalary() {
        return basesalary;
    }

    public double getSalary() {
        return salary;
    }
}
