package study.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2,"李元坤");
        map.put(4,"夏文浩");
        map.put(1,"詹彦哲");
        map.put(3,"戴岷君");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+","+value);
        }
        for ( Map.Entry<Integer,String> entry:set) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+","+value);
        }
    }
}
