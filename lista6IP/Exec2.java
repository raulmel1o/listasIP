//finalizado

public class Exec2 {
    public static void main (String[] args) {
        Olah.greet();
    }
}

public class Olah {
    static int n = (int) (1 + Math.random() * 3) ;

    //greetings method
    static void greet() {
		switch (n) {
            case 0:
                System.out.println("Olá!");
                break;
            case 1:
                System.out.println("Hallo!");
                break;
            case 2:
                System.out.println("Hello!");
                break;
            default:
                System.out.println("Saluton!");
        }
    }
}