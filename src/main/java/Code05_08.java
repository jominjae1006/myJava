import java.util.Scanner;

public class Code05_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("점수 입력 ==> ");
        a = sc.nextInt();

        if (a >=90)
            System.out.print("A");
        else if (a >=80)
            System.out.print("B");
        else if (a >=70)
            System.out.print("C");
        else if (a >=60)
            System.out.print("D");
        else
            System.out.print("F");

        System.out.println("학점입니다.");
        sc.close();
    }
}
