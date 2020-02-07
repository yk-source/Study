package study.day18;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo03FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\test1\\day01\\src\\study\\day18\\b.txt");
        int r = fis.read();
        System.out.println((char) r);
        fis.close();
    }
}
