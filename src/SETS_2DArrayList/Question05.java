package SETS_2DArrayList;

import java.util.ArrayList;

public class Question05 {
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
        ArrayList<Integer> list= new ArrayList<>();
        int[][] ary= {  { 1, 2, 3 },  { 4, 5, 6 },  { 7, 8, 9 } };
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                list.add(ary[i][j]);
            }
        }
        System.out.println("list = " + list);
    }
}
