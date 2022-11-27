import javax.swing.SortOrder;

// Вывести все простые числа от 1 до 1000 

public class dz2 {

    public static boolean isSimple(int num) {

        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        
        int num = 1000;

        for (int i = 2; i < num; i++) {
            if (isSimple(i)) System.out.printf("%d ", i);
        }   
        System.out.println();    
    }
}
