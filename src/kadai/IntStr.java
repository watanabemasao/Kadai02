package kadai;

import java.util.stream.IntStream; // ストリームの呼び出し

public class IntStr {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed( 1 , 10 ).sum(); // 指定した値を合計する(rangeClosedでストリーム生成)

        System.out.println(sum); //  (1+2+3+4+5+6+7+8+9+10)

    }
}