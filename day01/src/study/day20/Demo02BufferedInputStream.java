package study.day20;

import java.io.*;

public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\test1\\day01\\src\\study\\day20\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes=new byte[1024];
        int len = 0;
        while((len = bis.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
