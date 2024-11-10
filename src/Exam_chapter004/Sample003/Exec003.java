package Exam_chapter004.Sample003;
public class Exec003 {
    
    //オブジェクト指向の概念
    //ポリモフィズム(同じ操作が異なるオブジェクトによって異なる方法で実行される)
    public static void main(String[] args) {

        Game A = new Game();
        Game B = new NintendoDS();
        Game C = new PSP();

        System.out.println("【出力結果】");
        System.out.println("<Gameクラス>");
        A.play();
        System.out.println("");

        System.out.println("<NintendoDSクラス>");
        B.play();
        System.out.println("");

        System.out.println("<PSPクラス>");
        C.play();
        System.out.println("");

    }
}
