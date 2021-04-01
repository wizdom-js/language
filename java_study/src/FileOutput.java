import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/output01.txt");
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            // exit를 호출하여 프로그램 종료
            System.exit(1);
        }

        // 파일에 문자열 작성
        try {
            writer.write("치킨은 살 안쪄요");
            writer.close();
        } catch (IOException e) {
            System.out.println("파일에 데이터를 쓰는 데에 실패했습니다.");
            System.exit(2);
        }
    }
}
