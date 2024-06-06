package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Question02 {
    public static void main(String[] args) {
        //ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı.
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //Örneğin;
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count = 2 olmalı. (Orange 2 kez yazılmış)
        ArrayList<String> b = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Orange", "Peach", "Banana", "Orange"));
        int count = getCount(b, "Orange");
        System.out.println("Orange " + count + " kez yazılmış");
    }

    public static int getCount(ArrayList<String> b, String d) {
        int count = 0;
        for (int i = 0; i < b.size(); i++) {
                if (b.get(i).equals(d)) {
                    count++;
                }
        }
        return count;
    }
}
