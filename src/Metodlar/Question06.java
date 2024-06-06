package Metodlar;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        //powerOfThree isminde bir method oluşturun.
        //Parametre olarak int
        //Return tipi boolean
        //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        //**Örnek 1:**
        //**Girdi:** 27
        //**Çıktı:** true
        //Açıklama: 3*3*3 =27
        //Sonuç= true
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean answer = powerOfThree(num);
        System.out.println(answer);
    }

    public static boolean powerOfThree(int num) {
        boolean answer=false;
        if (num % 3 == 0)
            answer = true;
        return answer;
    }
}
