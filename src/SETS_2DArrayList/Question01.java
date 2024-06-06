package SETS_2DArrayList;

import java.util.HashSet;
import java.util.Set;

public class Question01 {
    public static void main(String[] args) {
        //Create a method totalCount()
        //Parametresi  'Integer Hashset' olmalı
        //HashSetteki eleman sayısını alın.
        //totalCount'u döndürün.
        //_**Örnek:**_
        //hashset ; 4,2,3,1,7
        //cevap: 5
        HashSet<Integer> hs= new HashSet<>();
        hs.add(4);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(7);
        int total=totalCount(hs);
        System.out.println("total = " + total);
    }
    public static int totalCount(HashSet<Integer> hs){
        int total= hs.size();
        return total;
    }
}
