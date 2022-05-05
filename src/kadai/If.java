package kadai;

public class If {
    public static void main(String[] args) {

        // 4 「引数が0なら偽。引数が1なら真」とコンソール画面

        int n = 1; //引数を指定

        if (n == 0) {       // 0であれば偽　それ以外は下へ
            System.out.println("偽");
        }

        else if (n == 1) {  // 1であれば真　それ以外は下へ
            System.out.println("真");
        }

        else {             // それ以外
            System.out.println("null");

        }
    }
}