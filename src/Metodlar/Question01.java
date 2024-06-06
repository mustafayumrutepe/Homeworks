package Metodlar;

public class Question01 {
    public static void main(String[] args) {
        //Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.
        System.out.println(randomNum(56));
    }

    public static int randomNum(int max) {
        int values = (int)(Math.random() * max);
        return values;
    }
}
