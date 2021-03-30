import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        System.out.println("지금부터 0~300 사이에서 숫자를 하나 뽑겠습니다.");
        System.out.println("여러분은 제가 뽑은 숫자를 맞춰야 합니다.");

        // 랜덤 숫자
        Random random = new Random();
        int randomNumber = random.nextInt(301);

        // 사용자로부터 숫자를 입력받아야 하므로 scanner 사용
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i = i + 1) {
            System.out.println(8 - i + "번의 기회가 있습니다.");

            System.out.println("추측한 숫자를 입력하세요.");
            // 사용자로부터 숫자를 입력받아 정수로 변환
            String input = scanner.nextLine();
            int guess = Integer.parseInt(input);

            if (randomNumber == guess) {
                System.out.println("와 정답입니다~~~!");
                break;
            }

            else if (randomNumber < guess) {
                System.out.println("깔깔 더 작은 숫자입니다~!");
            }

            else if (randomNumber > guess) {
                System.out.println("깔깔 더 큰 숫자입니다~!");
            }

            if (i == 7 ) {
                System.out.println("더이상 기회가 없습니다.ㅠㅠ");
            }
        }

        System.out.println("게임을 종료합니다.");
    }
}
