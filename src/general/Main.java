package general;

public class Main {

    public static void main(String[] args) {
	    try {
            int d = 0;
            int a = 40 / d;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 (" + e.getMessage() + ")");
        }
    }
}
