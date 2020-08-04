package B2_TH4;

import java.util.Scanner;

public class Manager {
    Student[] list = new Student[100];
    private int n;

     Scanner sc = new Scanner(System.in);

    public void setN(int n) {
        this.n = n;
    }

    public void openList(){
        System.out.println("Nhập số lượng sinh viên: ");
        this.n=sc.nextInt();
        int i;
        for (i=0;i<this.n;i++){
            list[i] = new Student();
            System.out.println("Nhập thông tin sinh viên thứ "+i);
            list[i].nhapSV();
        }
    }

    public void showList(){
        System.out.println("Danh sách sinh viên");
        System.out.println("MSV\tHọ tên\tĐiểm");
        int i;
        for (i=0;i<n;i++){
            list[i].xuatSV();
        }
    }

    public void sortList(){
        int i,j;
        Student t = new Student();
        for(i=0;i<n;i++)
            for(j=1;j<n;j++){
                if (list[i].getScore()>list[j].getScore()){
                    t=list[i];
                    list[i]=list[j];
                    list[j]=t;
                }
            }
    }
    public void findList(){

    }

}
