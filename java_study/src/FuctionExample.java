public class FuctionExample {

    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Chicken");
        printSum(3, 5);
    }

    public static void printSum(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a+b));
    }

    public static void sayHelloTo(String name) {
        System.out.println("Hello," + name);
    }

    public static void sayHello() {
        System.out.println("Hello.");
    }
}
