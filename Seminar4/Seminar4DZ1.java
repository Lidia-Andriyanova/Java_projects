// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package Seminar4;
import java.util.*;

public class Seminar4DZ1 {

    public static LinkedList<String> reverseList(LinkedList<String> musicList) {
     
        LinkedList<String> musicChart = new LinkedList<>();
        
        for (int i = musicList.size() - 1; i >= 0; i--) {
            musicChart.add(musicList.get(i));
        }
        return musicChart;
    }

    public static void main(String[] args) {

        LinkedList<String> musicList = new LinkedList<>();
        musicList.add("Red Hot Chili Peppers");
        musicList.add("AC/DC");
        musicList.add("Linkin Park");   
        musicList.add("30 seconds to Mars");  
        musicList.add("Metallica"); 

        System.out.println("Исходный список:");
        System.out.println(musicList);
    
        System.out.println("Перевернутый список:");
        System.out.println(reverseList(musicList));
    }
}
