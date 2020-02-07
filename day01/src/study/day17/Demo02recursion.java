package study.day17;

public class Demo02recursion {
    public static void main(String[] args) {
        int s = sum(11);
        System.out.println(s);
    }
    public static int sum(int i){
        if(i==1){
            return 1;
        }
        return i*sum(i-1);
    }

}
