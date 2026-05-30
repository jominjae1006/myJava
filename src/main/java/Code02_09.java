public class Code02_09 {
    public static void main(String[] args) {

        int number1 = 10, number2 = 20;
        int resBdd;
        int resSub;
        int resMul;
        double resDiv;

        resBdd = number1 + number2;
        resSub = number1 - number2;
        resMul = number1 * number2;
        resDiv = (double) number1 / number2;

        System.out.println(number1 + "+" + number2 + "=" + resBdd);
        System.out.println(number1 + "-" + number2 + "=" + resSub);
        System.out.println(number1 + "*" + number2 + "=" + resMul);
        System.out.println(number1 + "/" + number2 + "=" + resDiv);
    }
}
