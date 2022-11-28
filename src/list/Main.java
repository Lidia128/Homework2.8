package list;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(5,"кот5");
        orderedMap.put(8,"кот8");
        orderedMap.put(7,"кот7");
        orderedMap.put(6,"кот6");
        orderedMap.put(10,"кот10");
        orderedMap.put(1,"кот1");
        orderedMap.put(3,"кот3");
        orderedMap.put(9,"кот9");
        orderedMap.put(4,"кот4");
        orderedMap.put(2,"кот2");

        for (Map.Entry<Integer,String> entry : orderedMap.entrySet()){
            System.out.printf("%d : %s%n", entry.getKey(), entry.getValue());
        }
    }
}
