public class FunctionExample {

    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Java");
        printSum(5, 8);
        // sum이라는 메소드가 값을 반환하기 때문에 이 값을 변수로 받아야함
        int result = sum(4, 6);
        System.out.println(result);

        int[] sumAndProduct = addAndMultiply(2, 3);
        System.out.println("sum: " + sumAndProduct[0]);
        System.out.println("product: " + sumAndProduct[1]);

        boolean saidHola = sayHola("바보");
    }

    /*
    인사를 했다면 true 를 반환하고
    그렇지 않다면 false를 반환한다.
     */
    // return에 대해 더 알아보기
    // sayHelloTo와 동일한 기능을 하는 메소드 정의
    public static boolean sayHola(String name) {
        if (name.equals("바보")) {
            System.out.println("바르고 고운말을 사용해주세요.");
            // return 키워드를 이용해 메서드의 실행 중단 시키기
            return false;
        }
        System.out.println(name + "님, 안녕하세요?");
        return true;
    }

    // 같은 타입의 값을 여러개 반환해보기
    // 정수형 배열을 반환값으로 삼기
    // 두 정수를 더한 값과 곱한 값을 반환하는 메소드 정의.
    public static int[] addAndMultiply(int a, int b) {
        int sum = a + b;
        int product = a * b;

        int[] result = {sum, product};

        return result;
    }

    // 두 정수 더한 값을 반환하는 메소드 정의
    // 반환타입이 정수이기 때문에 int 넣어준다(void X)
    public static int sum(int a, int b) {
        return a + b;
    }

   // 두 수의 합을 출력하는 메소드 정의
    // 1 + 2 = 3의 형태로 덧셈을 출력한다.
    public static void printSum(int a, int b) {
        System.out.println(a + "+" + b + "=" + sum(a, b));
    }

    // 입력값이 존재하는 메소드 정의
    public static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }

    public static void sayHello() {
        System.out.println("Hello.");
    }
}
