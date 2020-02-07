package study.day10;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random random = new Random();
        //生成1~7的随机数
        int result = random.nextInt(7) + 1;
        StrategyDemoImpl2 str3 = new StrategyDemoImpl2();
        //str3.getResult2(result);
        System.out.println(result+"->"+str3.getResult2(result));
    }
}
