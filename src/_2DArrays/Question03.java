package _2DArrays;

public class Question03 {
    public static void main(String[] args) {
        //Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        //[{"new jersey","atlanta","ohio"} , {"Pittsburgh" ,"ohio","ohio"} , {"ohio","new york", "new jersey"}]
        //Bütün ohio'ları Florida'yla değiştiriniz. Array'i yazdırınız.
        String[][] strtable = {{"new jersey", "atlanta", "ohio"}, {"Pittsburgh", "ohio", "ohio"}, {"ohio", "new york", "new jersey"}};
        for (int i = 0; i < strtable.length; i++) {
            for (int j = 0; j < strtable[i].length; j++) {
                if (strtable[i][j]=="ohio")
                    strtable[i][j]="Florida";
            }
        }
        for (int i = 0; i < strtable.length; i++) {
            for (int j = 0; j < strtable[i].length; j++) {
                System.out.print(strtable[i][j]+",");
            }
            System.out.println();
        }
    }
}
