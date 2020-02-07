package study.day09;

import java.util.HashMap;
import java.util.Map;

public class StrategyDemo01Impl implements StrategyDemo01 {
    @Override
    public void sayCode(int num) {
        Map<Integer,Enum> map = new HashMap<>();
        map.put(1,Code.ONE);
        map.put(2,Code.TWO);
        map.put(3,Code.THREE);
        map.put(4,Code.FOUR);
        map.put(5,Code.FIVE);
        map.put(6,Code.SIX);
        map.put(7,Code.SEVEN);
        System.out.println(map.get(num));
    }
}
