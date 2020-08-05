package DeQuy;

import java.util.Scanner;

public class Main3 {
    public static String decTobin(int a, String target){
        if (a<2) return (a)+target;
        target = (a%2)+target;
        return decTobin(a/2, target);
    }

    public static String decTooct(int a, String target){
        if (a<8) return (a)+target;
        target = (a%8)+target;
        return decTooct(a/8, target);
    }

    public static String decToHex(int a, String target){
        if (a<16) {
            if (a<10)
                return (a)+target;
            else{
                switch (a){
                    case 10:
                        return "A"+target;
                    case 11:
                        return "B"+target;
                    case 12:
                        return "C"+target;
                    case 13:
                        return "D"+target;
                    case 14:
                        return "E"+target;
                    case 15:
                        return "F"+target;
                }
            }
        }
        if((a%16)<10) {
            target = (a % 16) + target;
        }
        else
        {
            switch (a%16){
                case 10:
                    target = "A"+target;
                    break;
                case 11:
                    target = "B"+target;
                    break;
                case 12:
                    target = "C"+target;
                    break;
                case 13:
                    target = "D"+target;
                    break;
                case 14:
                    target = "E"+target;
                    break;
                case 15:
                    target = "F"+target;
                    break;
            }
        }
        return decToHex(a/16, target);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int a=sc.nextInt();
        System.out.println("Bin: "+decTobin(a,""));
        System.out.println("Oct: "+decTooct(a,""));
        System.out.println("Hex: 0x"+decToHex(a,""));
    }
}