package study.day20;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\test1\\day01\\src\\study\\day20\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("我把数据写入到内部缓冲区".getBytes());
        bos.flush();
        bos.close();
    }
}
