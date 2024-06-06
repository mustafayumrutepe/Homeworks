package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Question04 {
    public static void main(String[] args) {
        //getLength() isminde bir method oluşturun.
        //Parametre olarak String ArrayList
        //Return tipi Integer ArrayList
        //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        //Tüm elementlerin uzunluğunu döndürün
        //Örneğin;
        //ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //Tüm Stringlerin uzunluklarını yazdırın;
        //cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> ary = new ArrayList<>(Arrays.asList("New jersey", "New york", "Ohio", "Florida", "Boston"));
        System.out.println("getLength() = " + getLength(ary));
    }

    public static ArrayList<Integer> getLength(ArrayList<String> ary) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < ary.size(); i++) {
            String length = ary.get(i);
            int L= length.length();
            l.add(L);
        }
        return l;
    }
}
