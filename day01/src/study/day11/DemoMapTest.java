package study.day11;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemoMapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for(char c:str.toCharArray()){
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
     /*   for(Character key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }*/


    }
}
