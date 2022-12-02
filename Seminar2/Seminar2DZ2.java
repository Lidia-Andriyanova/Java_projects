//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.*;

public class Seminar2DZ2 {

    public static void bubbleSort(int[] numArray) {

        writeLog(numArray, false);

        boolean wasReplace = false;
        int len = numArray.length;
        int temp = 0;

        for (int j = 1; j <= len - 1; j++) {
            wasReplace = false;
            
            for (int i = 0; i <= len - 1 - j; i++) {
                if (numArray[i] > numArray[i + 1]) {
                    temp = numArray[i];
                    numArray[i] = numArray[i + 1];
                    numArray[i + 1] = temp;
                    wasReplace = true;
                }
            }   
            writeLog(numArray, true);
            if (!wasReplace) break;
        }
    }

    public static void printArray(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]);
            System.out.print(" ");
        }
        System.out.println();
    }


    public static void writeLog(int[] numArray, boolean appendLine) {

        StringBuilder lineText = new StringBuilder();
        for (int i = 0; i < numArray.length; i++) {
            lineText.append(String.valueOf(numArray[i]));
            lineText.append(" ");
        }
        lineText.append("\n");

        try
            (FileWriter writer = new FileWriter("log.txt", appendLine))
        {
            writer.write(lineText.toString());
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }         
    }

    public static void main(String[] args) {
        
        int[] numArray = {9, 8, 0, 6, 4, 6, 1, 7, 5, 10, -3};
        System.out.println("Исходный массив");
        printArray(numArray);

        bubbleSort(numArray);

        System.out.println("Отсортированный массив");
        printArray(numArray);
        
        System.out.println("Подробнее по этапам сортировки в log.txt");
    }
}
