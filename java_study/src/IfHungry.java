public class IfHungry {
    public static void main(String[] args) {
        int money = 850;

        if (money > 800) {
            System.out.println("빵 맛있어 ! 뭘 더 사먹지?");
        } else if (money == 800 ) {
            System.out.println("빵 맛있어 ! 이제 남은 돈이 없네 ?");
        } else {
            System.out.println("돈이 모자라요 ㅠㅠ ");
        }
    }
}
