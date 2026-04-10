import java.util.Scanner;

public class Code05_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("1~3중에 선택하세요 : ");
        a=sc.nextInt();

        switch(a){
            case 1:
                System.out.println("1울 선택했습니다.");
                break;

            case 2:
                System.out.println("2를 선택했습니다.");
                break;
            case 3:
                System.out.println("3을 선택했습니다.");
            default:
                System.out.println("이상한 것을 선택했습니다.");

        }
        sc.close();
    }
}
