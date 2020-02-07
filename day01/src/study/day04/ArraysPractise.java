package study.day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一些字符串：");
        String str =sc.next();
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        System.out.println("正序结果是："+Arrays.toString(chars));
        System.out.println("================");
        System.out.println("倒叙结果是：");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);

        }
    }
}
