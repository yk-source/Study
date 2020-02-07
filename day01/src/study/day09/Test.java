package study.day09;

import java.util.Random;

public class Test implements StrategyDemo ,Strategy2Demo{
    public static void main(String[] args) {
        Random random = new Random();
        //生成1~10的随机数
        int result = random.nextInt(10) + 1;
        //请用策略模式优化以下代码
        for (int i = 1; i <= 7; i++) {
            if(i==result){
                new Strategy().sayCode(i);
            }
        }

        switch (result) {
            case 1:
                new Strategy1().sayCode();
                break;
            case 2:
                new Strategy2().sayCode();
                break;
            case 3:
                new Strategy3().sayCode();
                break;
            case 4:
                new Strategy4().sayCode();
                break;
            case 5:
                new Strategy5().sayCode();
                break;
            case 6:
                new Strategy6().sayCode();
                break;
            case 7:
                new Strategy7().sayCode();
                break;
            default:
                break;
        }
    }
}