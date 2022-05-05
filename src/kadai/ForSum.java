package kadai;

public class ForSum {
    public static void main(String[] args) {

        //2.「1～10まで足した結果」for文を使って4行程度に収める

        int sum = 0;   // データ型 変数名 = 値; 変数の初期化
        for ( int i = 1 ; i <= 10 ; i++ ){   // for (初期化式; 条件式; 変化式){}繰り返しの中で実行される処理

            sum += i;  // += 右辺の値を加算した結果を代入
        }

        System.out.println("合計"+sum);

    }
}
