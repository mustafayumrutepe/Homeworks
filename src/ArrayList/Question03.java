package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Question03 {
    public static void main(String[] args) {
        //getSum() isminde bir method oluşturun.
        //Parametresi ArrayList olmalı
        //Return tipi int olmalı.
        //ArrayList teki tüm sayıları birbiri ile toplayın.
        //return olarak toplam sonucu döndürün.
        //Örneğin;
        //Arraylist = 1,2,3,4,5
        //return 15 olmalı
        ArrayList<Integer> ary = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(getSum(ary));
    }

    public static int getSum(ArrayList<Integer> ary) {
        int t = 0;
        for (int i = 0; i < ary.size(); i++) {
            t += ary.get(i);
        }
        return t;
    }
}
