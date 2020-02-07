package study.day02;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            int num =r.nextInt(41)+1;
            System.out.println(num);

        }
    }
}
