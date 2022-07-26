package DataStructures.Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

/* .......... Merge Sorted Arrays .......... */
// Given 2 arrays that are sorted, can you merge these 2 arrays into 1 big one that is still sorted
// Ex: [0,3,4,31], [4,6,30] --> [0,3,4,4,6,30,31]

public class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        if (!(array1 instanceof int[] && array2 instanceof int[])) {
            System.out.println("Input type is NOT int[]");
        }
        else if (array1.length == 0) return array2;
        else if (array2.length == 0) return array1;

        int mergedArrayLenth = array1.length + array2.length;
        int[] mergedArray = new int[mergedArrayLenth];

        int i=0,j=0,counter=0;
        while(counter<mergedArrayLenth) {
            if (i==array1.length) {
                mergedArray[counter]=array2[j];
                j++;
            }
            else if (j==array2.length) {
                mergedArray[counter]=array1[i];
                i++;
            }
            else if (array1[i]<=array2[j]) {
                mergedArray[counter]=array1[i];
                i++;
            }
            else if (array1[i]>array2[j]) {
                mergedArray[counter]=array2[j];
                j++;
            }
            else {
                System.out.println("ERROR: Unexpected Case!");
            }
            counter++;
        }

        return mergedArray;
    }



    public static void main(String[] args) {

        int[] array1 = {0,3,4,31};
        int[] array2 = {4,6,30};
        int[] sortedArray = mergeSortedArrays(array1,array2);
        for (int i=0; i<sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }

        return;
    }
}
