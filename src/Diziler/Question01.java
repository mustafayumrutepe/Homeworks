package Diziler;

public class Question01 {
    public static void main(String[] args) {
        //Bu String'i oluşturun. "Removes white space from both ends of a string"
        //String'deki kelime sayısını yazdırınız.

        String text = "Removes white space from both ends of a string";
        String[] words = text.split(" ");
        System.out.println("words = " + words.length);


    }
}
