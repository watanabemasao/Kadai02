package kadai;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Lis1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //List<データ型名> オブジェクト名 = new ArrayList<データ型名>();

        list.add("a"); // 数字の場合は List<Integer> を使用 例：list.add(1);
        list.add("b");
        list.add("c");
        list.add("b");

        for(Iterator it = list.iterator(); it.hasNext();) {
            System.out.println(it.next());

        }
    }

}