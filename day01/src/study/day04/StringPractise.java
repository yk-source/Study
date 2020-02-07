package study.day04;

import java.util.Scanner;

public class StringPractise {
    public static void main(String[] args) {
        int[] array ={1,2,3};
        String result=fromArrayTOString(array);
        System.out.println(result);
    }
    public static String fromArrayTOString(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if( i == array.length-1){
               str=str+"word"+array[i]+"]";
            }else{
                str=str+"word"+array[i]+"#";
            }

        }
        return str;

    }
}