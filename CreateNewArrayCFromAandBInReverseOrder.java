package ua.infopulse.hometask_l5;
import java.util.Arrays;
import java.util.Random;

/*Rewrite elements from arrays A and B to array C in reverse order. */
public class CreateNewArrayCFromAandBInReverseOrder {
    public static void main (String [] args){
        int arrayA [] = new int [7];
        int[] arrayAReverse = new int [arrayA.length];
        Random r = new Random();
        int arrayB [] = new int [5];
        int [] arrayBReverse = new int [arrayB.length];
        int arrayC [] = new int [arrayAReverse.length + arrayBReverse.length];

        for (int i = 0; i < arrayA.length; i++){
            arrayA[i] = r.nextInt(20);
            arrayAReverse [arrayA.length-i-1] = arrayA[i];
        }
        System.out.println("Array A after sorting: " + Arrays.toString(arrayA));
        System.out.println("Array A before sorting: " + Arrays.toString(arrayAReverse));

        for (int i = 0; i < arrayB.length; i++){
            arrayB[i] = r.nextInt(20);
            arrayBReverse [arrayB.length-i-1] = arrayB[i];
        }
        System.out.println("Array B after sorting: " + Arrays.toString(arrayB));
        System.out.println("Array B before sorting: " + Arrays.toString(arrayBReverse));

        System.arraycopy(arrayAReverse, 0, arrayC, 0, arrayAReverse.length);
        System.arraycopy(arrayBReverse, 0, arrayC, arrayAReverse.length, arrayBReverse.length);
        System.out.println("Array C: " + Arrays.toString(arrayC));
    }
}


