public class practic2 {
    public static void main(String[] args) {
    boolean logic = andQuestion(10, 5);
    System.out.println(logic);
    }
    public static boolean andQuestion(int a, int b) {
        int sum = a + b;
        boolean logic = sum >= 10 && sum <= 20;
        return logic;
    }
}
