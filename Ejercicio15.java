import functions.matematicas;

public class Ejercicio15 {
    public static void main(String args[]) {
        for (int i = 1; i<=1000; i++) {
            if (matematicas.esPrimo(i)) {
                System.out.print(i+" ");
            }
        }
        
    }
}
