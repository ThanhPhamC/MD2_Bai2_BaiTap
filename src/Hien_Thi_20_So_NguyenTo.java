import java.util.Scanner;

public class Hien_Thi_20_So_NguyenTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("5. In ra 20 số nguyên tố đầu");
        int bienDem=0;
        for ( int count=2;count>0;count++){
            boolean check = true;
            int i=2;
            while (i <count) {
                if (count % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(count);
                bienDem++;
            }
            if (bienDem==20){
               break;
            }
        }
    }
}
