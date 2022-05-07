package training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lis2 {
    public static void main(String[] args) {

        String ans = "B";

        List<String> list = new ArrayList<>(Arrays.asList( "A" , "B" , "C" , "D" , "E" , "F" , "G" )); //初期値0番

        int index = list.indexOf(ans);

        System.out.println( ans + "の要素番号は" + index + "番です" );

    }

}
