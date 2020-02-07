package study.day18;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\test1\\day01\\src\\study\\day18\\b.txt");
        fos.write(49);
        fos.write(48);
        fos.write(48);
        fos.close();
    }
}
