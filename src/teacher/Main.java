package teacher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static LinkedList<Integer>list1= getNumberOne();
    public static LinkedList<Integer>list2= getNumberEnd();
    public static LinkedList<Integer> stringSet = new ArrayList<>();

    public static void main(String[] args){
        System.out.println("list1 = " + list1);
        System.out.println("list1 = " + list2);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                stringSet.add(list1.get(i) + " * " + list2.get(j) + " = ?");
            }
        }
        System.out.println(" " + stringSet);
        System.out.println("stringSet.size () = " + stringSet.size());

        Random random = new Random();
        int numberElement = 15;
        for (int i = 0; i < numberElement; i++) {
            int randomIndex = random.nextInt(stringSet.size());
            String randomElement = stringSet.get(randomIndex);
            stringSet.remove(randomIndex);
            System.out.println(randomElement);
        }
    }
       public static LinkedList<Integer> getNumberOne() {
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 2; i < 10; i++) {
            list1.add(i);
        }
        return list1;
    }
    public static LinkedList<Integer> getNumberEnd() {
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 2; i < 10; i++) {
            list2.add(i);
        }
        return list2;
    }
}