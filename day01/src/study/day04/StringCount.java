package study.day04;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一些字符串：");
        String str =sc.next();
        char[] ch=str.toCharArray();
        count(ch);
    }
    public static void count(char[] ch){
        int maxWord=0;
        int minWord=0;
        int num=0;
        int others=0;
        for (int i = 0; i < ch.length; i++) {
            char c=ch[i];
            if('A'<= c && c <='Z'){
                maxWord++;
            }else if('a'<= c && c<= 'z'){
                minWord++;
            }else if('0'<=c && c<= '9'){
                num++;
            }else {
                others++;
            }
        }
        System.out.println("大写字母有："+maxWord);
        System.out.println("小写字母有："+minWord);
        System.out.println("数字有："+num);
        System.out.println("其他有："+others);
    }

}
