import java.util.Scanner;

public class Code09_01 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] numAry = new int[4];
        int hap=0;

        System.out.print("숫자 :");
        numAry[0]= sc.nextInt();
        System.out.print("숫자 :");
        numAry[1]= sc.nextInt();
        System.out.print("숫자 :");
        numAry[2]= sc.nextInt();
        System.out.print("숫자 :");
        numAry[3]= sc.nextInt();

        hap=numAry[0]+numAry[1]+numAry[2]+numAry[3];
        System.out.println("합계 ==> "+ hap);
    }
}
