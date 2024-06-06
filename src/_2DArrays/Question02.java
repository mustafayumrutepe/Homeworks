package _2DArrays;

public class Question02 {
    public static void main(String[] args) {
        //Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        //2D array'de olan elemanları toplayınız.
        //toplamı yazdırınız.
        //Sonuç 32 olmalıdır.
        int[][] table = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        int t=0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                t+=table[i][j];
            }
        }
        System.out.println("total = " + t);
    }
}
