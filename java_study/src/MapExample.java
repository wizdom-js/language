import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hippo", "하마");
        dictionary.put("chicken", "닭");

        // 값 삭제하는 방법
        dictionary.put("chicken", null);
        dictionary.remove("chicken");

        System.out.println(dictionary.size());

       if (dictionary.isEmpty()) {
           System.out.println("단어가 하나도 없습니다.");
           // 그대로 종료
          System.exit(0);
       } else {
           System.out.println(dictionary.size() + " 개의 단어가 있습니다.");
       }


        // 사용자가 입력한 영단어를 한글로 번역해주는 영단어 사전 만들기
        Scanner scanner = new Scanner(System.in);

        String english = scanner.nextLine();
        String korean = dictionary.get(english);

        if (korean == null) {
            System.out.println("사전에 존재하지 않는 단어입니다.");
        } else {
            System.out.println(english + "는 " + korean + "입니다.");
        }
    }
}
