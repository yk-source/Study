package study.day10;

import java.util.HashMap;
import java.util.Map;

public class StrategyDemoImpl implements StrategyDemo {
    @Override
    public Code getResult(int result) {
        Map<Integer,Code> map = new HashMap<>();

        map.put(1,new Strategy().getCode1());
        map.put(2,new Strategy().getCode2());
        map.put(3,new Strategy().getCode3());
        map.put(4,new Strategy().getCode4());
        map.put(5,new Strategy().getCode5());
        map.put(6,new Strategy().getCode6());
        map.put(7,new Strategy().getCode7());
        Code code = map.get(result);
        return code;
    }
}
