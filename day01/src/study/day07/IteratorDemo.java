package study.day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("李元坤");
        coll.add("夏文浩");
        coll.add("詹彦哲");
        coll.add("戴岷君");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("=============");
        for(String i : coll){
            System.out.println(i);
        }

    }
}
