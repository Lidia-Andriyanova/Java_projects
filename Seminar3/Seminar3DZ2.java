// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Seminar3;

import java.util.ArrayList;
//import java.util.Random;
import java.lang.Math;

public class Seminar3DZ2 {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        
        int size = 20;
        int startValue = 0;
        int endValue = 100;
        int element;

        System.out.println("Исходный список: ");
        for (int i = 0; i < size; i++) {
            element = (int)(Math.random() * (endValue - startValue) + startValue);
            numList.add(element);
            System.out.printf("%d ", element);
        }
        System.out.println();
        
        // Удаление четных элементов
        for (int i = size - 1; i >= 0; i--) {
            element = numList.get(i);
            if (element % 2 == 0) {
                numList.remove(i);   
            }
        }

        System.out.println("Список без четных элементов: ");
        for (int i = 0; i < numList.size(); i++) {
            System.out.printf("%d ", numList.get(i));
        }
        System.out.println();        
    }
}
