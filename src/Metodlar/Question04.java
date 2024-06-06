package Metodlar;

public class Question04 {
    public static void main(String[] args) {
        // adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java
        String str = "Java yazın";
        System.out.println(reverseWord(str));
    }

    public static String reverseWord(String str) {

        String[] words = str.split(" ");
        String revStr ="";

        for (int i = words.length-1; i >=0; i--) {
            revStr+=words[i];
            revStr+=" ";
        }
        return revStr;
    }
}
