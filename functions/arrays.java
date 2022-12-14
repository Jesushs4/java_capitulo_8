package functions;

public class arrays {
    public static int[] generaArrayInt(int arraylength, int min, int max) {
        int[] array = new int[arraylength];
        for (int i = 0; i<arraylength; i++) {
            int rand = ((int)(Math.random()*(max-min+1))+min);
            array[i] = rand;
        }
        return array;
        
    }

    public static int minimoArrayInt(int[] array) {
        int min = Integer.MAX_VALUE;
        int length = array.length;
        for (int i = 0; i<length; i++) {
            if (array[i]<min) {
                min = array[i];
            }
        }
        return min;
        }

        public static int maximoArrayInt(int[] array) {
            int max = Integer.MIN_VALUE;
            int length = array.length;
            for (int i = 0; i<length; i++) {
                if (array[i]>max) {
                    max = array[i];
                }
            }
            return max;
            }
        
    public static int mediaArrayInt(int[] array) {
        int average = 0;
        int length = array.length;
        for (int i = 0; i<length; i++) {
                average += array[i];
        }
        return average/length;
        }

    public static boolean estaEnArrayInt(int[] array, int num) {
        int length = array.length;
        for (int i = 0; i<length; i++) {
                if (num == array[i]) {
                    return true;
                }
        }
        return false;
        }
    public static int[] volteaArrayInt(int[] array) {
        int length = array.length;
        int[] newarray = new int[length];
        for (int i = 0; i<length; i++) {
                newarray[i] = array[length-i-1];
        }
        return newarray;
        }
}