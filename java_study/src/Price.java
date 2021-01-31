import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        // 음식 이름을 입력하면 가격을 출력해주는 프로그램
        System.out.println("메뉴 번호를 입력해주세요.");
        System.out.println("1. 치킨");
        System.out.println("2. 국밥");
        System.out.println("3. 피자");

        Scanner scanner = new Scanner(System.in);
        int menuNumber;

        // 숫자가 아닌 것을 입력했을 때의 예외처리
        try {
           menuNumber = scanner.nextInt();
        } catch (Exception e) {
            menuNumber = -1;
        }

        switch (menuNumber) {
            case 1 :
                System.out.println("치킨은 만원입니다.");
                break;
            case 2 :
                System.out.println("국밥은 오천원입니다.");
                break;
            case 3:
                System.out.println("피자는 이만원입니다.");
                break;
            default :
                System.out.println("올바른 메뉴 번호를 입력해주세요.");
        }
    }
}
