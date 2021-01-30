public class NestedIf {
    public static void main(String[] args) {
        // 두 조건 만족하는 if문
        int age = 15;

        if (age >= 10 && age <20) {
            System.out.println("10대");
        } else {
            System.out.println("10대 아님");
        }

        // && 연산자 자세하게 실습
        // 조건이 두가지이기 때문에 4가지 경우가 있다.
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(true && false);

        // 두 조건 중 일부만 만족해도 실행하기
        if (age < 10 || age >= 20) {
            System.out.println("10대 아님");
        } else {
            System.out.println("10대");
        }

        // or 연산자 알아보기
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(true || false);
    }
}
