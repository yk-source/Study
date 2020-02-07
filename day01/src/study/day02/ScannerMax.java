package study.day02;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个数：");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("最大值为："+max(a,b,c));
    }
    public static int max(int a, int b,int c){
        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        return max;
    }
}
