package study.day09;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        //生成1~10的随机数
        int result = random.nextInt(10) + 1;
        //请用策略模式优化以下代码
        StrategyDemo01Impl str = new StrategyDemo01Impl();
        str.sayCode(result);
    }
}