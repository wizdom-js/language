import java.util.Random;
import java.util.Scanner;

public class UpAndDownWithMethod {

    // 랜덤하게 생성된 숫자를 전역에서 사용하기 위해 멤버변수로 변수 선언
    public static int randomNumber;
    /*
    scanner와 같이 사용자 입력을 받는 인터페이스는
    프로그램이 실행될때부터 한번만 생성해놓고 계속해서 재사용할 수 있는 것이므로
    멤버변수로 선언해준다.
     */
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // random number 초기화
        Random random = new Random();
        randomNumber = random.nextInt(256);

        // 시도 횟수 변수
        int attempt = 0;

        while (attempt < 8) {
            boolean isCorrect = play();

            if (isCorrect) {
                break;
            }

            attempt = attempt + 1;
            System.out.println(attempt + "회 시도하였습니다.");
        }

        System.out.println("게임을 종료합니다.");
    }

    public static boolean play() {
        System.out.println("숫자를 입력하세요.");
        // 사용자로부터 숫자 입력받기
        int input = scanner.nextInt();

        if (input == randomNumber) {
            System.out.println("정답입니다.");
            return true;
        } else if (input > randomNumber) {
            System.out.println("더 작은 값입니다.");
        } else {
            System.out.println("더 큰 값입니다.");
        }
        // else if와 else에 각각 사용해주지 않고 종료부분에 한번만 사용해줄 수 있다.
        return false;
    }
}