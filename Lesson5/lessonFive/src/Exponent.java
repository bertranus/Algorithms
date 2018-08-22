public class Exponent {
    public static void main(String[] args) {
        System.out.println(exponent(2, 7));
    }

    private static int exponent(int i, int exp) {
        if (exp == 0) return 1;
        return i * exponent(i , exp - 1);
    }
}
