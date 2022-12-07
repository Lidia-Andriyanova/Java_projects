package Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class Seminar4DZ2 {

    public static void enqueue(LinkedList<String> queueList, String element) {
        queueList.add(element);
    }

    public static String first(LinkedList<String> queueList) {
        if (queueList.size() > 0) return queueList.get(0);
        else return null;
    }   
    public static boolean removeFirst(LinkedList<String> queueList) {
        if (queueList.size() > 0) {
            queueList.remove(0);
            return true;
        }
        else return false;
    }        

    public static void main(String[] args) {

        LinkedList<String> queueList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        String userIn = "";
        String[] command;
        String element;
    
        while (true){

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Введите команду работы со списков (пустой ввод - выход):");
            System.out.println("\tenqueue элемент\t- помещает элемент в конец очереди");
            System.out.println("\tdequeue\t\t- возвращает первый элемент из очереди и удаляет его");
            System.out.println("\tfirst\t\t- возвращает первый элемент из очереди, не удаляя");
            System.out.println("-------------------------------------------------------------------------------");

            userIn = scanner.nextLine();

            if (userIn.equals("")) break;
            else if (userIn.indexOf("enqueue ") == 0) {
                command = userIn.split(" ");
                enqueue(queueList, command[1]);
            }
            else if (userIn.equals("dequeue")) {
                element = first(queueList);
                if (element == null) System.out.println("Отсутствуют элементы в списке");
                else {
                    System.out.printf("Первый элемент списка \"%s\" удален\n", element);
                    removeFirst(queueList);
                }
            }
            else if (userIn.equals("first")) {
                element = first(queueList);
                if (element == null) System.out.println("Отсутствуют элементы в списке");
                else System.out.printf("Первый элемент списка: %s\n", element);
            }            
            else {
                System.out.printf("Неправильная команда\n\n");
                continue;
            }

            System.out.print("Результирующий список: ");
            System.out.println(queueList);
            System.out.println();                    
        }   
        
        
    }
}
