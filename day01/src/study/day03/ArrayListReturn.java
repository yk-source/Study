package study.day03;

import java.util.ArrayList;
import java.util.Random;
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> listMax=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            listMax.add(r.nextInt(100));
        }
        ArrayList<Integer> listMIN =ArrayListMin(listMax);
        for (int i = 0; i < listMIN.size(); i++) {
            System.out.println(listMIN.get(i));
        }
        System.out.println("偶数一共有："+ listMIN.size());
    }
    public static ArrayList<Integer> ArrayListMin(ArrayList<Integer> listMax){
        ArrayList<Integer> listMin=new ArrayList<>();
        for (int i = 0; i < listMax.size(); i++) {
            int num =listMax.get(i);
            if(num%2==0){
                listMin.add(num);
            }
        }
        return listMin;
    }
}
