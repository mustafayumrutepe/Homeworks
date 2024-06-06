package Diziler;

import java.util.Arrays;

public class Question10 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız
        int[] ary={14 , 19 , 5 , 21};
        Arrays.sort(ary);
        System.out.println(ary[0]);
    }
}
