package Diziler;

public class Question07 {
    public static void main(String[] args) {
        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.
        int[] array={12, 14 , 21 ,23 , 10 ,4};
        double t=0, avg=0;
        for (int i = 0; i < array.length; i++) {
            t+=array[i];
        }
        avg=t/array.length;
        System.out.println("avg = " + avg);
    }
}
