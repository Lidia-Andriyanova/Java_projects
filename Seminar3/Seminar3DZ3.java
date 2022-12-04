// Задан целочисленный список ArrayList. Найти минимально, максимальное и среднее из этого списка

package Seminar3;

import java.util.ArrayList;

public class Seminar3DZ3 {
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        
        int size = 20;
        int startValue = 0;
        int endValue = 100;
        int element;
        int max = startValue;
        int min = endValue;
        int avg = 0;

        System.out.println("Cписок: ");
        for (int i = 0; i < size; i++) {
            element = (int)(Math.random() * (endValue - startValue) + startValue);
            numList.add(element);
            System.out.printf("%d ", element);

            if (element > max) max = element;
            else if (element < min) min = element;

            avg += element;
        }
        avg /= size;

        System.out.println();
        System.out.printf("Максимальное число: %d\n", max);
        System.out.printf("Минимальное число: %d\n", min);
        System.out.printf("Среднее значение: %d\n", avg);
    }
}
