public class Code06_08 {
    public static void main(String[] args){
        int hap=0;
        for(int a=1001; a<=2000; a+=2){
            hap+=a;
        }
        System.out.println("1000부터 2000까지 홀수이 합계 :"+hap);
    }
}
