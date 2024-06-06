package SETS_2DArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Question02 {
    public static void main(String[] args) {
        //changeSet() isminde bir method oluşturun.
        //Parametre olarak bir String HashSet   ve  iki String
        //return hashset olmalı
        //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //**ÖRNEK:**
        //hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //String 1 = **banana**
        //String 2 = **peach**
        //**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
        HashSet<String> Hs = new HashSet<>(Arrays.asList("banana", "strawberry", "kiwi", "pineapple"));
        String s1 = "banana";
        String s2 = "peach";
        HashSet<String> newHs = changeSet(Hs, s1, s2);
        System.out.println("Hs = " + Hs);
        System.out.println("newHs = " + newHs);
    }

    public static HashSet<String> changeSet(HashSet<String> Hs, String s1, String s2) {
        HashSet<String> newHs = new HashSet<>();
        newHs.addAll(Hs);
        if (Hs.contains(s1)) {
            newHs.remove(s1);
            newHs.add(s2);
        }
        return newHs;
    }
}
