package B2_TH5;

public class Manager {
    ConNguoi[] list = new ConNguoi[1000];
    int n=0,i=0;
    public void nhap(int c){
        if (c==1){
            list[n] = new GiaoVien("","","",0.0,0.0,0);
            list[n].inputInfo();
            list[n].calcSalary();
        }
        else{
            list[n] = new NhanVien("","","",0.0,0.0,0);
            list[n].inputInfo();
            list[n].calcSalary();
        }
        n++;

    }

    public void xuat(){
        for (i=0;i<n;i++){
            System.out.println("Thông tin người thứ "+i+" ");
            list[i].outputInfo();
        }
    }

    public void inSort(){
        int j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(list[i].getSalary()<list[j].getSalary()){
                    if ((list[i].isNV()==1) && (list[j].isNV()==1)){
                        ConNguoi t = new NhanVien("","","",0.0,0.0,0);
                        t=list[i];
                        list[i]=list[j];
                        list[j]=t;
                    }
                    if ((list[i].isGV()==1) && (list[j].isGV()==1)){
                        ConNguoi t = new GiaoVien("","","",0.0,0.0,0);
                        t=list[i];
                        list[i]=list[j];
                        list[j]=t;
                    }
                    if ((list[i].isGV()==1) && (list[j].isNV()==1)){
                        ConNguoi t1 = new GiaoVien("","","",0.0,0.0,0);
                        ConNguoi t2 = new NhanVien("","","",0.0,0.0,0);
                        t1=list[i];             t2=list[j];
                        list[i] = new NhanVien("","","",0.0,0.0,0);
                        list[j] = new GiaoVien("","","",0.0,0.0,0);
                        list[i] = t2;
                        list[j] = t1;

                    }
                    if ((list[i].isNV()==1) && (list[j].isGV()==1)){
                        ConNguoi t1 = new GiaoVien("","","",0.0,0.0,0);
                        ConNguoi t2 = new NhanVien("","","",0.0,0.0,0);
                        t1=list[j];             t2=list[j];
                        list[j] = new NhanVien("","","",0.0,0.0,0);
                        list[i] = new GiaoVien("","","",0.0,0.0,0);
                        list[j] = t2;
                        list[i] = t1;

                    }
                }
            }
        }
    }

}
