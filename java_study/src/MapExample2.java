import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("hippo", "하마");
        dictionary.put("chicken", "닭");

        if (dictionary.isEmpty()) {
            System.out.println("단어가 하나도 없습니다.");
            // 그대로 종료
            System.exit(0);
        } else {
            System.out.println(dictionary.size() + " 개의 단어가 있습니다.");
        }

        // 키 목록만 가져오기
       Collection<String> keys = dictionary.keySet();
        for (String english : keys) {
            System.out.println(english);
        }

        // 값 목록 가져오기
        Collection<String> values = dictionary.values();
        for (String korean: values) {
            System.out.println(korean);
        }

        // entryset
        Set<Map.Entry<String, String>> entries = dictionary.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String english = entry.getKey();
            String korean = entry.getValue();

            System.out.println(english + ": " + korean);
        }
    }
}
