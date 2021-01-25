public class StringExample {
    public static void main(String[] args) {
        System.out.println("안녕하세요 저는 누구누"); // 문자열
        System.out.println('나'); // 문자
        System.out.println("\"자바\"를 공부해요");
        System.out.println("자바는 쉬워요. \n자바는 어려워요.");
        // 이건 주석이에오
        /* 이건
        여러줄의
        주석입니다.
         */

        // 문자형 타입
        String chicken = "치킨은 맛있어.";
        String pizza = "피자도 맛있어요.";
        System.out.println(chicken);
        System.out.println(pizza);

        String chickenAndPizza = chicken + pizza;
        System.out.println(chickenAndPizza);

        // 문자 길이 세기
        System.out.println(chicken.length());
        int length = chicken.length();
        System.out.println(length);

        // 문자 일부 바꾸기
        String replaced = chicken.replaceAll("맛있어", "맛없어");
        System.out.println(replaced);

        // 문자열 자르기
        String birthday = "2021/01/01";
        String year = birthday.substring(0, 4);
        String day = birthday.substring(8);
        System.out.println("출생년도:" + year);
        System.out.println("출생일:" + day);
    }
}
