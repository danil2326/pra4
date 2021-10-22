public class practic6 {
    public static void main(String[] args) {
        int a = 2021;
        if((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("високосный");
        } else {
            System.out.println("не високосный");
        }
    }
}
