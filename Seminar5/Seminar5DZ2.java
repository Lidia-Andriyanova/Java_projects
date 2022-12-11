package Seminar5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.nio.charset.StandardCharsets;


public class Seminar5DZ2 {
    public static void main(String[] args) {
       
        // Сотрудники - получение из файла
        ArrayList<String> employeeList = new ArrayList<>();

        File file = new File("employee.txt");
        try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()) {
                employeeList.add(sc.nextLine());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Словарь имен сотрудников
        HashMap<String, Integer> firstNameMap = new HashMap<>();  

        for (int i = 0; i < employeeList.size(); i++) {

            String firstName = employeeList.get(i).split(" ")[0];

            if (firstNameMap.containsKey(firstName)) {
                Integer count = firstNameMap.get(firstName);
                firstNameMap.replace(firstName, ++count);
            }
            else {
                firstNameMap.putIfAbsent(firstName, 1);
            }
        }

        // Отсортированный список количества вхождений
        ArrayList<Integer> countList = new ArrayList<>();

        for (Integer element: firstNameMap.values()) {
            if (!countList.contains(element))  {
                countList.add(element);     
            }
        }
        Collections.sort(countList, Collections.reverseOrder());

        // Вывод словаря по отсортированному списку
        for (Integer orderElement: countList) {
            for (String key: firstNameMap.keySet()) {
                if (orderElement == firstNameMap.get(key))  {
                    System.out.printf("%s - %d\n", key, firstNameMap.get(key));
                }
            }            
        }
    }
}
