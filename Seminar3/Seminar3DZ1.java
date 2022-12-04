// Реализовать алгоритм сортировки слиянием

package Seminar3;

public class Seminar3DZ1 {

    public static void mergeSort(int[] numArray, int sourceLen) {
        if (sourceLen < 2) {
            return;
        }
        int midlleLen = sourceLen / 2;
        int[] leftArray = new int[midlleLen];
        int[] rightArray = new int[sourceLen - midlleLen];
    
        for (int i = 0; i < midlleLen; i++) {
            leftArray[i] = numArray[i];
        }
        for (int i = midlleLen; i < sourceLen; i++) {
            rightArray[i - midlleLen] = numArray[i];
        }
        mergeSort(leftArray, midlleLen);
        mergeSort(rightArray, sourceLen - midlleLen);
    
        merge(numArray, leftArray, rightArray, midlleLen, sourceLen - midlleLen);
    }


    public static void merge(int[] numArray, int[] leftArray, int[] rightArray, int leftLen, int rightLen) {
 
        int i = 0, j = 0, k = 0;
        while (i < leftLen && j < rightLen) {
            if (leftArray[i] <= rightArray[j]) {
                numArray[k++] = leftArray[i++];
            }
            else {
                numArray[k++] = rightArray[j++];
            }
        }
        while (i < leftLen) {
            numArray[k++] = leftArray[i++];
        }
        while (j < rightLen) {
            numArray[k++] = rightArray[j++];
        }
    }

    public static void printArray(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numArray = {10, -1, 8, 12, -3, 0, 7, 90, 100, 1};
        System.out.println("Исходный массив:");
        printArray(numArray);
        mergeSort(numArray, numArray.length);
        System.out.println("Отсортированный массив:");
        printArray(numArray);
    }
    
}
