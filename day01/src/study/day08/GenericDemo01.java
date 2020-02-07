package study.day08;

import java.util.ArrayList;

public class GenericDemo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("def");
        printArray(list1);
        printArray(list2);
    }

    private static void printArray(ArrayList<?> list) {
        for (Object i:list
             ) {
            System.out.println(i);
        }
    }
}
