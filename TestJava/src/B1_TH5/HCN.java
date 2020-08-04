package B1_TH5;

public class HCN extends HinhHoc {
    public HCN(float dai, float rong){
        super(dai,rong);
    }

    @Override
    public void out(){
        System.out.println("Là hình chữ nhật");
        System.out.println();
        System.out.println("Diện tích: " + this.dai * this.rong);
        System.out.println("Chu vi: " + (this.dai + this.rong) * 2);
    }

    @Override
    public void draw(){
        super.draw();
    }
}
