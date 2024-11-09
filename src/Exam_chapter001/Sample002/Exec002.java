package Exam_chapter001.Sample002;
public class Exec002 {
    
    //データの宣言と使用
    //変数や定数の宣言と初期化、値の有効範囲

    //定数宣言
    //クラス内でアクセスでき、値の変更は可能
    public static int static_VALUE = 50;

    //クラス内でアクセスでき、値の変更は不可
    public static final int static_final_VALUE = 100;

    public static void main(String[] args) {

        //変数宣言
        //メソッド内でアクセスできる
        int main_VALUE = 30;
        
        //コンソール上に出力
        System.out.println("【出力結果】");
        System.out.println("・main_VALUEは：" + main_VALUE);
        System.out.println("・static_VALUEは：" + static_VALUE);
        System.out.println("・static_final_VALUEは：" + static_final_VALUE);
        System.out.println("");

        //変数に1を追加する
        main_VALUE++;
        static_VALUE++;

        //コンソール上に出力
        System.out.println("【出力結果】");
        System.out.println("・main_VALUEは：" + main_VALUE);
        System.out.println("・static_VALUEは：" + static_VALUE);
        System.out.println("・static_final_VALUEは：" + static_final_VALUE);
        System.out.println("");
        
    }
}
