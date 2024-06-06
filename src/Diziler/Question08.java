package Diziler;

public class Question08 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın.
        int[] ary = {5,6,8,12,14,19};
        int t=0;
        for (int i = 0; i < ary.length; i++) {
            if (ary[i]%2==1)
                ary[i]*=-1;
            t+=ary[i];
        }
        System.out.println("t = " + t);
    }
}
