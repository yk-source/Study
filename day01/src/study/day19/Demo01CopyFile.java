package study.day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long l =System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\test1\\day01\\src\\study\\day19\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\test1\\day01\\src\\study\\day19\\b.txt");
        byte[] bytes = new byte[1024];
        int len =0;
        while ((len = fis.read(bytes))!= -1){
           fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制时间为"+(e-l)+"毫秒");
    }
}
