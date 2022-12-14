import functions.matematicas;

public class Ejercicio16 {
    public static void main(String args[]) {
        for (int i = 1; i<=1000; i++) {
            if (matematicas.esCapicua(i)) {
                System.out.print(i+" ");
            }
        }
        
    }
}
