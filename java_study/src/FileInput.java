import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        FileInputStream inputStream = null; // null : 아무 값도 없음
        // 이 상태로 사용하게 되면(null로) 오류가 발생하므로 꼭 값을 대입하고 난 뒤, 사용해야 한다.

        try {
            inputStream = new FileInputStream("src/chicken.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 스캐너를 생성하면서 FileInputStream을 입력 소스로 넣어주기
        Scanner scanner = new Scanner(inputStream);

        // 반복문을 통해 출력
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

    }
}
