package gr.aueb.cf.ch5;

public class SwapApp {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.printf("a = %d, b = %d\n", a, b);

        swap(a, b);
        System.out.printf("a = %d, b = %d", a, b);

    }

    /**
     * Mutually exchanges of the two input
     * variables
     * @param a
     * @param b
     */
    public static void swap(int a, int b) {

        int temp;
        temp = a;
        a = b ;
        b = temp;
        System.out.printf("a = %d , b = %d\n", a ,b);
    }
}
