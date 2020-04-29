public class Exec27 {
    public static void calc (int a, int b) {
        int produto = a * b;
        int quociente = a / b;
        int resto = a % b;

        System.out.printf("O produto de a x b: %d\n",produto);
        System.out.printf("O quociente da divisão de a por b: %d\n",quociente);
        System.out.printf("O resto da divisão de a por b: %d \n", resto);
    }
    public static void main (String[] args) {
        calc(5,2);
    }
}