package study.day02;

import java.util.Random;
import java.util.Scanner;

public class DemoRandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int result = r.nextInt(100)+1;
        System.out.println("系统将会在0-100之中随机选择一个数字,您可以自行选择猜测数字的次数。");
        System.out.println("您希望有几次机会？");
        int a= sc.nextInt();
        System.out.println("请输入你猜测的数字(您有"+a+"次机会！)：");

           // while (true) {
                for(int i= 1;i<=a;i++) {
                    int num = sc.nextInt();
                    if (i != a &&num > result) {
                        System.out.println("第" + i + "轮," + "猜大了,请再猜！");
                        // num = sc.nextInt();
                    } else if (i != a &&num < result) {
                        System.out.println("第" + i + "轮," + "猜小了,请再猜！");
                    } else if (i == a && num != result) {
                        System.out.println("sorry,游戏结束！");
                        break;
                    } else {
                        System.out.println("猜对了，" + num);
                        System.out.println("游戏结束！");
                        break;
                    }
                }
            //}


    }
}

