package study.day01;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        System.out.println("需要几个数进行取最大值");
        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        System.out.println("请输入" + a + "数字：");
        int[] array=new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        System.out.println("最大值为：" + max(array));
        //System.out.println(array.toString());
    }
    public static int max(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max=array[i];
            }
        }
        return max;
    }
}
