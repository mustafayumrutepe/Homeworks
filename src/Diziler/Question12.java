package Diziler;

public class Question12 {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın
        String[] ary = {"Apple", "Orange", "Banana", "Pineapple"};
        boolean cont = false;
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] == "Apple")
                cont = true;
        }
        System.out.println("cont = " + cont);
    }
}
