package Metodlar;

import java.util.Arrays;

public class Question05 {
    public static void main(String[] args) {
        //Girilen bir diziyi tersten yazdıran bir metod yazınız.

        int[] ary= {12,34,5,3,45,23,22,66};
        int[] rAry = Reverse(ary);
        System.out.println(Arrays.toString(rAry));
        }
    public static int[] Reverse(int [] ary){
        int[] rAry=new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
            rAry[i]=ary[ary.length-i-1];
        }
        return rAry;
    }
}
