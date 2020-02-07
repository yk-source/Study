package study.day03;

import java.util.ArrayList;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<Integer> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            Integer name =list.get(i);
            System.out.print(name);
            if(i==list.size()-1){
                System.out.print("}");
            }else {
                System.out.print("@");
            }

        }
    }
}
