import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        // 사용자 입력을 위해 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        // 메모 읽고 쓰기 반복
        while (true) {
            System.out.println("원하는 작업 번호를 입력해주세요.");
            System.out.println("1. 메모 읽기");
            System.out.println("2. 새 메모");
            System.out.println("3. 종료");

            // 작업번호를 입력할 변수
            int taskNum;

            // 번호 입력받아 taskNum에 넣기
           try {
                String input = scanner.nextLine();
                taskNum = Integer.parseInt(input);
            } catch (NumberFormatException e) {
               // 예외처리 (번호 아닌것 입력했을 경우)
               System.out.println("잘못된 입력입니다.");
               // 반복문의 처음으로 돌아감
               continue;
           }

           if (taskNum == 1) {
               System.out.println("메모 파일명을 입력하세요.");

               String fileName = scanner.nextLine();

               FileInputStream inputStream = null;

               try {
                   inputStream = new FileInputStream(fileName);
               } catch (FileNotFoundException e) {
                   System.out.println("파일이 존재하지 않습니다.");
                   continue;
               }

               System.out.println(fileName + "의 내용을 출력합니다.");

               // 파일의 내용 읽기 위해 스캐너 생성
               Scanner reader = new Scanner(inputStream);

               // 한 줄씩 읽어오기 반복
               while (reader.hasNextLine()) {
                   System.out.println(reader.nextLine());
               }
               System.out.println("\n");

               reader.close();
           }

           else if (taskNum == 2) {
               System.out.println("저장할 메모 파일명을 입력하세요.");

               String fileName = scanner.nextLine();

               FileWriter writer = null;

               try {
                   writer = new FileWriter(fileName);
               } catch (IOException e) {
                   System.out.println("파일 생성에 실패했습니다.");
                   continue;
               }

               System.out.println("메모할 문자열을 입력하세요.");
               System.out.println("종료: 빈 줄에서 엔터 입력");

               while (true) {
                   String input = scanner.nextLine();

                   if (input.equals("")) {
                       break;
                   }

                   try {
                       writer.write(input);
                       writer.write("\n");
                   } catch (IOException e) {
                       System.out.println("파일에 문자열을 입력하지 못했습니다.");
                   }
               }

               try {
                   writer.close();
               } catch (IOException e) {
                   System.out.println("파일을 닫는 데 실패했습니다.");
               }
           }

           else if (taskNum == 3) {
               System.out.println("프로그램을 종료합니다.");
               break;
           }

           else {
               System.out.println("잘못된 입력입니다.");
           }
        }
    }
}
