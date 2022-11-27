// Реализовать простой калькулятор (операции + - / * )

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int result = iScanner.nextInt();

        String operand = "";
        int num = 0;
        String resume = "";

        while (true) {
        
            System.out.print("Введите операцию (+ - / *): ");
            operand = iScanner.next();

            System.out.print("Введите число: ");
            num = iScanner.nextInt();

            if (operand.equals("+")) result += num;
            else if (operand.equals("-")) result -= num;
            else if (operand.equals("/")) result /= num;
            else if (operand.equals("*")) result *= num;
            else {
                System.out.println("Некорректная операция повторите ввод");
                continue;
            }
            System.out.printf("Результат: %d\n", result);
            System.out.print("Закончить - q, продолжить операции с получившимся числом - другой символ: ");
            resume = iScanner.next();
            if ((resume.equals("q")) || (resume.equals("Q"))) {
                break;
            }
        }
    }   
}
