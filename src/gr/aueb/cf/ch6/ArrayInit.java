package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση ενός πίνακα
 * Populate έναν πίνακα
 * new
 * unsized init
 * array initializer
 * print τα στοιχεία ενός πίνακα
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3]; //declare and init
        int[] arr2 = {1, 2, 3, 4, 5}; //unsized initialize

        int[] arr3;
        arr3 = new int[] {1, 2, 3, 4, 5}; //array initializer

        //populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        //traverse
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        //enhanced for
        for (int el : arr3) {
            System.out.println(el + "");
        }
    }
}
