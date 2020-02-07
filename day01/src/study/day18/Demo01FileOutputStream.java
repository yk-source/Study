package study.day18;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\test1\\day01\\src\\study\\day18\\a.txt");
        fos.write(97);
        fos.close();
    }
}
