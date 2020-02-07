package study.day18;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo04FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\test1\\day01\\src\\study\\day18\\b.txt");
        byte[] b =new byte[1024];
        int len =0;
        while ((len = fis.read(b))!= -1){
           //System.out.println(new String(b));
        }
    }
}
