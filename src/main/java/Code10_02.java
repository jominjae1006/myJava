public class Code10_02 {
    static void drawDice(){
        int diceNum;
        diceNum=(int) (Math.random() * 6);
        System.out.println("결과 :"+diceNum);
    }

    public static void main(String[] args){
        char name='A';
        for(int i=0; i<3; i++){
            System.out.println(name + "님, 주사위를 던집니다~");
            drawDice();
            System.out.println();
        }
    }
}
