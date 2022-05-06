package kadai;

import java.util.HashMap;
import java.util.Map;

public class Ma1 {

    public static void main(String[] args) throws Exception { //throws Exception 例外処理

       // 6.（自由課題）任意のプログラムで例外を起こしてみる。

        Map< Integer, String > map = new HashMap<>(); // HashMap<キーのデータ型,値のデータ型> 変数名 = new HashMap<>();

        int countnumber = 6 ; // 要素の数を代入させる　throws Exception で数が多いとnull出力

        map.put( 1, " MAP1 " );
        map.put( 2, " MAP2 " );
        map.put( 3, " MAP3 " );
        map.put( 4, " MAP4 " );
        map.put( 5, " MAP5 " );

        for ( int i = 1 ; i <= countnumber ; i++ ){

            System.out.println( map .get( i )); // Mapから要素を取得:Integerの数を取得し繰り返し

        }
    }
}
