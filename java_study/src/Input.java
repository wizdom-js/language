import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 키보드로부터 한 줄 입력받기
        Scanner scanner;
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);

        // 키보드로부터 띄어쓰기 단위로 입력받기
        Scanner scanner1 = new Scanner(System.in);

        String input1 = scanner1.next();
        String input2 = scanner1.next();
        String input3 = scanner1.next();

        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);

        // 키보드로 입력받은 숫자 사용하기
        System.out.println("숫자를 하나 입력해주세요");
        Scanner scannerNumber = new Scanner(System.in);
        String intInput = scannerNumber.nextLine();
        System.out.println(intInput + 1);
        // 예외 처리하기
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println(intValue + 1);
        } catch (Exception e) {
            System.out.println("숫자를 입력해야 합니다.");
        }

        // 예제
        Scanner scannerEx = new Scanner(System.in);
        System.out.println("달러 환율을 입력하세요.");
        String exchangeString = scannerEx.nextLine();
        System.out.println("순대국값을 입력하세요.");
        String priceOfSoupString = scannerEx.nextLine();
        double exchange = Double.parseDouble(exchangeString);
        double priceOfSoup = Double.parseDouble(priceOfSoupString);
        System.out.println("순대국은 " + priceOfSoup / exchange + "달러입니다.");
   }
}
