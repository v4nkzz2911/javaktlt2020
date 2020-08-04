package B1_TH5;

public class HV extends HinhHoc {
    private float a;
    public HV(float dai, float rong){
        super(dai,rong);
        this.a=dai;
    }


    @Override
    public void out(){
        System.out.println("Là hình vuông");
        System.out.println();
        System.out.println("Diện tích: " + this.a * this.a);
        System.out.println("Chu vi: " + this.a*4);
    }

    @Override
    public void draw(){
        int i,j;
        for(i=1;i<=a;i++){
            for (j=1;j<=a;j++) System.out.print("*  ");
            System.out.println();
        }
    }
}
