package study.day16;

public class Demo03InvokeCalc {
    public static void main(String[] args) {
        invokeCalc(5, 4, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        invokeCalc(10,20,(int a,int b)->{
            return a+b;
        });
    }
    private static  void invokeCalc(int a,int b, Calculator calculator){
        int result = calculator.calc(a, b);
        System.out.println("结果是："+result);
    }
}
