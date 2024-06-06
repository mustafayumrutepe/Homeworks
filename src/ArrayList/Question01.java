package ArrayList;

import java.util.ArrayList;

public class Question01 {
    public static void main(String[] args) {
        //Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //**Girdi:**
        //[
        // [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        //]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]
        int[][] ary = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                arrayList.add(ary[i][j]);
            }
        }
        System.out.println("arrayList = " + arrayList);
    }
}
