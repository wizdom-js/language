import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String a = "초밥";
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
