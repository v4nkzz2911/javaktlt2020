package B2_TH5;

import java.util.Scanner;

public class Manager {
    ConNguoi[] listGV = new ConNguoi[1000];
    ConNguoi[] listNV = new ConNguoi[1000];
    int n=0,i=0,j=0,m=0;
    public void nhap(int c){
        if (c==1){
            listGV[n] = new GiaoVien("","","",0.0,0.0,0);
            listGV[n].inputInfo();
            listGV[n].calcSalary();
            n++;
        }
        else{
            listNV[m] = new NhanVien("","","",0.0,0.0,0);
            listNV[m].inputInfo();
            listNV[m].calcSalary();
            m++;
        }


    }

    public void xuat(){
        System.out.println("Danh sách Giáo viên");
        for (i=0;i<n;i++){
            System.out.println("Thông tin người thứ "+i+" ");
            listGV[i].outputInfo();
        }
        System.out.println("Danh sách Nhân viên");
        for (i=0;i<m;i++){
            System.out.println("Thông tin người thứ "+i+" ");
            listNV[i].outputInfo();
        }
    }

    public void inSort(){
        int j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(listGV[i].getSalary()<listGV[j].getSalary()){
                        ConNguoi t = new GiaoVien("","","",0.0,0.0,0);
                        t=listGV[i];
                        listGV[i]=listGV[j];
                        listGV[j]=t;
                    }
                }
            }

        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                if(listNV[i].getSalary()<listNV[j].getSalary()){
                    ConNguoi t = new NhanVien("","","",0.0,0.0,0);
                    t=listNV[i];
                    listNV[i]=listNV[j];
                    listNV[j]=t;
                }
            }
        }
    }

    public void search(int rep){
        Scanner sc = new Scanner(System.in);
        String t;
        int check=0;
        System.out.println("Nhập tên cần tìm: ");
        t = sc.nextLine();
        if (rep==1){
            for (i=0;i<n;i++){
                if (listGV[i].getName().equals(t)){
                    listGV[i].outputInfo();
                    check=1;
                }
            }
            if (check==0) System.out.println("Không tìm thấy");
        }
        else{
            for (i=0;i<m;i++){
                if (listNV[i].getName().equals(t)){
                    listNV[i].outputInfo();
                    check=1;
                }
            }
            if (check==0) System.out.println("Không tìm thấy");
        }

    }



}
