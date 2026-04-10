import java.util.Scanner;

public class Code06_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hap=0;
        int a,b;

        while (true){
            System.out.print("숫자1 ==> ");
            a = sc.nextInt();
            System.out.print("숫자2 ==> ");
            b = sc.nextInt();

            hap= a+b;
            System.out.println(a+"+"+b+"="+hap);
        }
    }
}
