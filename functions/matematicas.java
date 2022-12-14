package functions;

public class matematicas {

    /** Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
     * @param x un número entero positivo
     * @return true si el numero es capicua
     * @return false en caso contrario
     */
public static boolean esCapicua(int x) {
    int numvolt = voltea(x);
    
    if (x!=numvolt) {
        return false;
    }
    return true;
}

    /** Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
     * @param x un número entero positivo
     * @return true si el numero es primo
     * @return false en caso contrario
     */

public static boolean esPrimo(int x) {
    for (int i = 2; i<x; i++) {
        if ((x%i)==0) {
            return false;
        }
    }
    return true;
}

    /** Devuelve el menor primo que es mayor al número que se pasa como parámetro.
     * @param x un número entero positivo
     * @return num tras encontrar el primo en int
     */
public static int siguientePrimo(int x) {
    int num = x+1;
    while (esPrimo(num)==false) {
        num++;
    }
    return num;
}

    /** Dada una base y un exponente devuelve la potencia.
     * @param x un número entero positivo
     * @param y un número entero positivo
     * @return potencia en float
     */
public static float potencia(int x, int y) {
    float potencia = (float)Math.pow(x, y);
    return potencia;
}

    /** Cuenta el número de dígitos de un número entero.
     * @param x un número entero positivo
     * @return digitos que tien el numero en int
     */
public static int digitos(int x) {
    int digitos = 0;
    while (x>0) {
        x/=10;
        digitos++;
    }
    return digitos;
}

    /** Le da la vuelta a un número.
     * @param x un número entero positivo
     * @return num dado la vuelta en int
     */
public static int voltea(int x) {
    int num = 0;
    while (x>0) {
        num*=10;
        num+=(x%10);
        x/=10;
    }
    return num;
}

    /** Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
     * @param num un número entero positivo
     * @param position un número entero positivo para la posición del número
     * @return numvolt%10 en int que será el número de la posición elegida
     */
public static int digitoN(int num, int position) {
    int numvolt = voltea(num);
    for (int i = 0; i<position-1; i++) {
        numvolt/=10;
    }
    return numvolt%10;
}

    /** Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
     * @param num un número entero positivo
     * @param numfind el número entero positivo a encontrar en num
     * @return numpos en int que será la posición del numero a encontrar
     */
public static int posicionDeDigito(int num, int numfind) {
    int numvolt = voltea(num);
    int numpos = -1;
    int repeats = 1;
    while (numvolt>0) {
        if (numvolt%10 == numfind) {
            numpos = repeats;
            numvolt=0;
        }
        numvolt/=10;
        repeats++;
    }
    return numpos;
}

    /** Le quita a un número n dígitos por detrás (por la derecha).
     * @param num un número entero positivo
     * @param numremove el número entero positivo de digitos a quitar
     * @return num con los numeros quitados
     */
public static int quitaPorDetras(int num, int numremove) {
    float remove = (float)Math.pow(10, numremove);
    num /= remove;
    return num;
}

    /** Le quita a un número n dígitos por delante (por la izquierda).
     * @param num un número entero positivo
     * @param numremove el número entero positivo de digitos a quitar
     * @return num con los numeros quitados
     */
public static int quitaPorDelante(int num, int numremove) {
    num = voltea(num);
    num = (quitaPorDetras(num, numremove));
    return num = voltea(num);
}

    /** Añade un dígito a un número por detrás.
     * @param num un número entero positivo
     * @param numadd el número entero positivo que se quiere agregar
     * @return num con el numero añadido
     */

    public static int pegaPorDetras(int num, int numadd) {
        num*=10;
        return num+=numadd;
    }

        /** Añade un dígito a un número por delante.
     * @param num un número entero positivo
     * @param numadd el número entero positivo que se quiere agregar
     * @return num con el numero añadido
     */

     public static int pegaPorDelante(int num, int numadd) {
        num = voltea(num);
        num = (pegaPorDetras(num, numadd));
        return num = voltea(num);
     }

    /** Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
     * @param num un número entero positivo
     * @param ini el número entero positivo que será la posición inicial
     * @param fin el número entero positivo que será la posición final
     * @return num que será el trozo que queda
     */

    public static int trozoDeNumero(int num, int ini, int fin) {
        int digits = digitos(num);
        num = quitaPorDetras(num, ini-1);
        num = quitaPorDelante(num, digits-fin);
        return num;
    }
    public static int trozoDeNumero(long num, int ini, int fin) {
        trozoDeNumero((int)num, ini, fin);
        return (int)num;
    }

    /** Pega dos números para formar uno.
     * @param num1 un número entero positivo
     * @param num2 el número entero positivo
     * @return num1 que son los dos numeros juntados
     */

    public static int juntaNumeros(int num1, int num2) {
        int digitos = digitos(num2);
        num1 *= (int)potencia(10,digitos);
        num1 += num2;
        return num1;
    }

    public static int BinarioaDecimal(int num) {
        int mult = 1;
        int sum = 0;
        while (num>0) {
            sum += (num%10)*mult;
            mult *= 2;
            num /= 10;
        }
        return sum;
    }

    public static int DecimalaBinario(int num) {
        int sum = 0;
        while (num>0) {
        sum*=10;
        sum += num%2;
        num/=2;
        }
        return sum;
    }
}

