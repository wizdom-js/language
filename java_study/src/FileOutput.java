import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/output01.txt", true);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            // exit를 호출하여 프로그램 종료
            System.exit(1);
        }

        // 사용자가 입력한 문자열 파일에 쓰기
        // 1. 스캐너 만들기
        Scanner scanner = new Scanner(System.in);

        System.out.println("종료하려면 입력 없이 엔터를 누르세요.");

        // 2. 입력 받고 파일에 쓰기 반복
       while (true) {
           String input = scanner.nextLine();

           // 빈문자열(엔터)을 입력받았을 때 종료하도록
           if (input.equals("")) {
               System.out.println("파일 입력을 종료합니다.");
               break;
           }

           try {
               // 각각 입력받은 문자열들 줄바꿈
               writer.write(input + "\n");
           } catch (IOException e) {
               System.out.println("파일에 데이터를 쓰는 데에 실패했습니다.");
               System.exit(2);
           }
       }

        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일 닫기에 실패했습니다.");
        }
    }
}
