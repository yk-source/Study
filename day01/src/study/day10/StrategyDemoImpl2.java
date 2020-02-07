package study.day10;

public class StrategyDemoImpl2 {
    public StrategyDemo.Code getResult2(int result){
        StrategyDemoImpl str2 = new StrategyDemoImpl();
        return str2.getResult(result);
    }
}
