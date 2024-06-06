package Class.NotDefteri;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogretmen {
    public static void main(String[] args) {
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);
        ArrayList<Ogrenci> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Ogrenci ogr = new Ogrenci();

            System.out.println("Öğrenci okul numarasını giriniz");
            ogr.okulNo = okuInt.nextInt();
            System.out.println("Öğrenci tam adını giriniz");
            ogr.tamAdi = okuStr.nextLine();
            System.out.println("Öğrenci notunu giriniz");
            ogr.notu = okuInt.nextInt();

            list.add(ogr);
        }
        ogrMetod(list);
        notOrt(list);
    }

    public static void ogrMetod(ArrayList<Ogrenci> list) {
        for (Ogrenci k: list)
            System.out.println(k.okulNo+"\t"+k.tamAdi+"\t"+k.notu);
    }
    public static void notOrt(ArrayList<Ogrenci> list){
        int total=0;
        for (Ogrenci p:list)
            total+=p.notu;
        double ort=total/list.size();
        System.out.println("ort = " + ort);
    }
}
