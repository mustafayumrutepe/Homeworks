package Metodlar;

public class Question02 {
    public static void main(String[] args) {
        //   "OrtaKelime" isminden bir method oluşturun.
        //   Bu method String'i parametre olarak almalı.
        //   Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //   Ortadaki kelimeyi return yapınız.
        //   Örnek: Ben Java'yı seviyorum.
        //   print : Java'yı
        //   Örnek2:
        //   Java'yı kolayca öğreniyorum.
        //   print: kolayca
        String sentence="Ben Java'yı seviyorum.";
        System.out.println("OrtaKelime = " + OrtaKelime(sentence));
    }
    public static String OrtaKelime(String sentence){
        String[] words= sentence.split(" ");
        int ortInx= words.length/2;
        return words[ortInx];
    }
}
