import java.util.Scanner;

public class Hien_Thi_Hinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("***********Menu***************");
            System.out.println("1.Ve hinh tam giac ");
            System.out.println("2.Ve hinh vuong");
            System.out.println("3.Ve hinh chu nhat");
            System.out.println("4.Ve hinh tam giac nguoc");
            System.out.println("5.Thoat");
            System.out.print("Lua chon cua ban la : ");
            int a = Integer.parseInt(sc.nextLine());
            switch (a) {
                case 1:
                    for (int i = 0; i <= 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3 :
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 6; i >0; i--) {
                        for (int j = 0; j <i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 5: break;
            }
        }while (true);



    }
}
