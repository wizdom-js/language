public class WrapperTypes {
    public static void main(String[] args) {
        Integer integerNumber = 3;
        Long longNumber = 3L;
        Float floatNumber = 3.0f;
        Double doubleNumber = 3.0d;
        Boolean booleanValue = true;

        // 바꾸기
        float floatChange = integerNumber.floatValue(); // 3.0f
        double doubleChange = integerNumber.doubleValue(); //3.0d
        String stringChange = integerNumber.toString(); // "3"

    }
}
