// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class dz1 {

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();

        int sum = 0;
        int mult = 1;

        for (int i = 1; i <= n; i++) {
            sum += i;
            mult *= i;
        }
        System.out.printf("Сумма чисел от 1 до n = %d. n! = %d\n", sum, mult);

    }
}