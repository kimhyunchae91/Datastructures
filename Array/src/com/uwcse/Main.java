package com.uwcse;
import java.util.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //Page 466 chapter 7 Arrays
        int[] list = new int[6];
        list[0] = 78;
        list[1] = 8;
        list[2] = 7;
        list[3] = -2;
        list[4] = 14;
        list[5] = 3;
        /*
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        reverseTraversal(list);
        System.out.println();
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }*/
        /*
        printIt(list);
        rotateLeft(list);
        printIt(list);
        rotateRight(list);
        printIt(list);
        */







    }

    public static void printIt(int[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void scanner(){
        /*
            Array - An indexed structure that holds multiple values of the same type.

            Index - An integer indicating the position of a particular
            value in a data structure.

            Zero-Based Indexing - A numbering scheme used throughout Java in which a
            sequence of values is indexed starting with 0 (element 0, element1,
            element2, and so on).

            Auto-Initialization - The initialization of variables to a default value,
            such as on an array's elements when it is constructed.

            Array Traversal - Processing each array element sequentially from the
            first to the last.

            Sequential Access - Manipulating values in a sequential manner from
            first to last.

            Random Access - Manipulating values in any order whatsoever to allow quick
            access to each value.



            ***************DECLARING AN ARRAY INSTANCE***************
            * <element type>[] <name> = new <element type>[<length>]*
            *         double[] temperature = new double[3];         *
            *********************************************************

            double[] temperature = new double[3];

            temperature[0] = 74.3;
            temperature[1] = 68.4;
            temperature[2] = 70.3;
         */
        Scanner console = new Scanner(System.in);
        System.out.print("How many day's of temperature? ");
        int numDays = console.nextInt();
        int[] temps = new int[numDays];
        int sum = 0;

        for (int i = 0; i < numDays; i++){
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }

        double average = (double) sum / numDays;

        int above = 0;

        for (int i =0; i < temps.length; i++){
            if (temps[i] > average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average = " + average);
        System.out.println(above + " days above average");
    }

    public static void forEachLoop(){
        /*
            for (int i : temps){
                above++;
            }

         */

    }

    public static void generalArray(){
        /*
            <element type>[] <name> = {<value>, <value>, ..., <value>}

            copyOf(array, newSize)- returns a copy of the array with the given size.

            copyOfRange(array, startIndex, endIndex) - returns a copy of the given subportion
                    of the given array from startIndex (inclusive) to endIndex (exclusive)

            equals(array1, array2) returns true if the arrays contain the same elements

            fill(array, value) - sets every element of the array to be the given value

            sort(array) - rearranges the elements so that they appear in sorted
                          (nondecreasing) order.
            toString(array) - returns a String representation of the array, as in [3, 5, 7]
        */
        int[] test = {1,2,3,4,5,6,7};
        String[] lib = {"hi", "what", "no", "yes"};

    }

    public static void reverseTraversal(int[] list){

        for(int i = 0; i < list.length / 2; i++){
            int j = list.length - i - 1;
            swap(list, i, j);
        }
    }

    public static void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void referenceTypes() {
        /*
            Value Semantics ( Value Types ) -
            A system in which values are stored
            directly and copying is achieved by creating independent copies of values.
            Types that use value semantics are called value types.

            Reference Semantics (Reference Types) -
            A system in which references to values are stored and copying is achieved by
            copying these references. Types that use reference semantics are called
            reference types.


         */
    }

    public static void rotateRight(int[] list){
        int last = list[list.length - 1];
        for(int i = list.length - 1; i >= 1; i--){
            list[i] = list[i-1];
        }
        list[0] = last;
    }

    public static void rotateLeft(int[] list){
        int first = list[0];
        for(int i = 0; i < list.length - 1; i++){
            list[i] = list[i + 1];
        }

        list[list.length - 1] = first;
    }

    public static void pointers(){
        Point[] points = new Point[3];
        points[0] = new Point(3, 7);
        points[1] = new Point(4,5);
        points[2] = new Point(6,2);


    }

    public static void print(double[][] grid){
        /*
        Multidimensional Array -
        An array of arrays, the element of which are accessed with multiple integer
        indexes.

         */
    }

}
