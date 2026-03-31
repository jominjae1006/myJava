import java.util.Scanner;

public class Code05_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.print("숫자 입력 --> ");
        a = sc.nextInt();

        if (a > 100){
            if (a < 10009){
                System.out.println("100보다 크고 1000보다 작군요.");
            }
            else {
                System.out.println("와~~ 1000보다 크군요.");
            }

        }
        else {
            System.out.println("음~~ 100보다 작군요.");
        }
        sc.close();
    }
}
