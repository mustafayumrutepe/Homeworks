package Diziler;

import java.util.Arrays;

public class Question02 {
    public static void main(String[] args) {
        //Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.
        //_Cevap böyle olmalı :  "dlroW olleH"_
        String text = "Hello World";
        String ters = "";
        for (int i = text.length()-1; i >=0; i--) {
            ters+=text.charAt(i);
        }
        System.out.println(ters);
    }
}
