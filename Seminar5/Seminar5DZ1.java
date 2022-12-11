package Seminar5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

import javax.swing.text.StringContent;

public class Seminar5DZ1 {

    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.putIfAbsent("+7(915)842-20-40", "Ivanov");
        phoneBook.putIfAbsent("+7(960)813-21-35", "Petrov");
        phoneBook.putIfAbsent("+7(976)889-89-76", "Sidorov");
        phoneBook.putIfAbsent("+7(925)845-27-44", "Romanov");
        phoneBook.putIfAbsent("+7(915)842-20-41", "Ivanov");

        Scanner scanner = new Scanner(System.in);

        String userIn;
        boolean findUser;

        while (true) {

            System.out.print("1 - добавление, 2 - удаление, 3 - поиск, 4 - просмотр, 0 - выход: ");
            userIn = scanner.nextLine();

            if (userIn.equals("0")) break;
            // Добавление
            else if (userIn.equals("1")) {
                System.out.print("Введите ФИО: ");
                String user = scanner.nextLine();
                System.out.print("Введите телефон: ");
                String phone = scanner.nextLine();
                phoneBook.putIfAbsent(phone, user);
            }
            // Удаление
            else if (userIn.equals("2")) {
                System.out.print("Введите ФИО: ");
                String user = scanner.nextLine();
                findUser = false;

                Iterator<String> it = phoneBook.keySet().iterator();
                while (it.hasNext()) {
                    String key = it.next();
                    if (Objects.equals(user.toLowerCase(), phoneBook.get(key).toLowerCase()))  {
                        findUser = true;
                        System.out.printf("Удален: %s - телефон: %s\n", phoneBook.get(key), key);
                        it.remove();
                 }
                }
                if (!findUser) System.out.printf("Не найдено для удаления\n");                
            }
            // Поиск
            else if (userIn.equals("3")) {
                System.out.print("Введите ФИО: ");
                String user = scanner.nextLine();
                findUser = false;
                for (String phone: phoneBook.keySet()) {
                    if (Objects.equals(user.toLowerCase(), phoneBook.get(phone).toLowerCase()))  {
                        findUser = true;
                        System.out.printf("Найден: %s - телефон: %s\n", phoneBook.get(phone), phone);
                    }
                }
                if (!findUser) System.out.printf("Не найдено\n");
            }     
            // Просмотр       
            else if (userIn.equals("4")) {
                for (String phone: phoneBook.keySet()) {
                    System.out.printf("%s - телефон: %s\n", phoneBook.get(phone), phone);
                }
            }            
            else {
                System.out.printf("Неправильная команда\n\n");
                continue;
            }
            System.out.println();                                
        }
    }
}
