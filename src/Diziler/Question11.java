package Diziler;

import java.util.Arrays;

public class Question11 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.
        int[] ary={12,2,5,15,8};
        Arrays.sort(ary);
        System.out.println(ary[ary.length-1]);
    }
}
