package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Question05 {
    public static void main(String[] args) {
        //İsmi changelnArraylist() olan bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2
        //Arraylist'te s1'i s2 olarak değiştirin
        //Return String arrayList
        //Örneğin;
        //Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        //s1 = blue
        //s2 = yellow
        //Tüm blue 'ları yellow'a dönüştürün.
        //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> ary = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        String s1="blue";
        String s2="yellow";
        System.out.println(changelnArraylist(ary, s1, s2));
    }
    public static ArrayList<String> changelnArraylist(ArrayList<String> ary, String s1, String s2){
        for (int i = 0; i < ary.size(); i++) {
            if (ary.get(i).equals(s1))
                ary.set(i,s2);
        }
        return ary;
    }
}
