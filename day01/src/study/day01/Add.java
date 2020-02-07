package study.day01;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("结果是："+ get(a,b));
    }
    public static int get(int a, int b){
        int num = a+b;
        return num;
    }
}
