package Diziler;

import java.util.Arrays;

public class Question09 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
        int[] ary = {15, 25, 22, 18, 30};
        Arrays.sort(ary);
        System.out.println(ary[ary.length-2]);
    }
}
