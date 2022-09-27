import java.util.Scanner;

public class HthiSoNtoNhohon100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("5. In ra các số nguyên tố nhỏ hơn 100");
        for ( int count=2;count<=100;count++){
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
            }
        }
    }
}
