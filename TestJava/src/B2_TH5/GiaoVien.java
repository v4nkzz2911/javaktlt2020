package B2_TH5;

import java.util.Scanner;

public class GiaoVien extends ConNguoi {
    protected String mainstream;

    public GiaoVien(String name, String birthday, String sex, double salary, double rate, int basesalary) {
        super(name, birthday, sex, salary, rate, basesalary);
    }

    public GiaoVien(String name, String birthday, String sex, double salary, double rate, int basesalary, String mainstream) {
        super(name, birthday, sex, salary, rate, basesalary);
        this.mainstream = mainstream;
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuyên ngành: ");
        this.mainstream = sc.nextLine();
    }

    @Override
    public void calcSalary(){
        this.salary = this.basesalary * this.rate;
        this.salary = this.salary * 1.3;
    }

    @Override
    public void outputInfo(){
        super.outputInfo();
        System.out.println("Chuyên ngành: "+this.mainstream);

    }

    @Override
    public int isNV(){
        return 0;
    }

    @Override
    public int isGV(){
        return 1;
    }

    public String getMainstream() {
        return mainstream;
    }
}
