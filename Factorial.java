public class Factorial {

    public static void main(String[] args) {
        int numero = 5; //
        System.out.println("Factorial de " + numero + " es: " + factorial(numero));
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("numero no debe ser negativo");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}