import java.util.Scanner;

public class HthiSoNtoNhohon100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("5. In ra các số nguyên tố nhỏ hơn 100");
        boolean check ;
        int N = 2;
        while (N < 100) {
            check = true;
            for (int i = 2; i < N; i++)
                if (N % i == 0) {
                    check = false;
                    break;
                }
            if (check) {
                System.out.printf("%d ",N);

            }
            N++;
        }
    }
}
