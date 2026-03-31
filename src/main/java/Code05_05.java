import java.util.Scanner;

public class Code05_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a%2 == 0){
            System.out.println("짝수군요.");
        }
        else {
            System.out.println("홀수군요.");
        }
        System.out.println("프로그램 끝!");
        sc.close();
    }
}
