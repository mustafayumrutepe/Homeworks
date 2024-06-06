package Diziler;

public class Question13 {
    public static void main(String[] args) {
        //Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.
        String str = "$12 $23 $10 $2 $5 $2";
        str=str.replace("$","");
        String[] dvd=str.split(" ");
        int t=0;
        for (int i = 0; i < dvd.length; i++) {
            t+=Integer.parseInt(dvd[i]);
        }
        System.out.println("t = " + t);
    }
}
