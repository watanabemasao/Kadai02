package kadai;

import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class DateWeek {
    public static void main(String[] args) {

        //3.「3年後の今日が何曜日なのか」を計算して、コンソール画面に表示
        // （※LocalDateTimeとDayOfWeekを使うこと）

        int year = 3;  // 変数yearに何年後かを代入

        LocalDateTime dt = LocalDateTime.now(); // nowは現在日時が設定されたインスタンスを生成
        dt = dt.plusYears( year ); // year年後の今日を代入
        DayOfWeek dw = dt.getDayOfWeek(); //dtで指定した曜日を変数dwに代入

        System.out.println(dt);
        System.out.println(dw);

    }
}
