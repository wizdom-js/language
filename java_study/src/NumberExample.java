public class NumberExample {
    public static void main(String[] args) {
        System.out.println(1 + 2);

        // 정수형
        byte byteInteger = 127;
        short shortInteger = 20;
        int intInteger = 30;
        long longInteger = 40;

        int sum = byteInteger + shortInteger;
        long sum2 = intInteger + longInteger;

        // 실수형
        float floatNumberO = 1.2f;
        double doubleNumber = 4.3;

        // 실수형 표현의 한계
        float floatSum = 0.001f + 0.001f + 0.0001f;
        System.out.println(floatSum);
    }
}
