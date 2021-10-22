public class practic4 {
    public static void main(String[] args) {
        boolean negativ = isNegative(0);
        System.out.println(negativ);
    }

        public static  boolean isNegative(int a) {
        boolean negativ = a < -1;
        return negativ;
        }


}
