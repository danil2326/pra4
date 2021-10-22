public class practic1 {

    public static void main(String[] args) {
        float result = calcSum(0.2f, 0.3f, 0.4f, 0.5f);
        System.out.println(result);
    }

    public static float calcSum(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;


    }
}



