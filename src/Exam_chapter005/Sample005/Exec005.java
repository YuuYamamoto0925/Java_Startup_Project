package Exam_chapter005.Sample005;
public class Exec005 {
    
    //クラスの定義とオブジェクトの使用
    //static 変数および static メソッド

    public static void main(String[] args) {

        //CountオブジェクトAの生成
        Count A = new Count(20);
        System.out.println("【Aの確認】");
        System.out.println("・Aのstatic変数の中身は：" + A.getstatic_count());
        System.out.println("・Aのインスタンス変数の中身は：" + A.getinstance_count());
        System.out.println("");

        //CountオブジェクトBの生成
        Count B = new Count(30);
        System.out.println("【Bの確認】");
        System.out.println("・Bのstatic変数の中身は：" + B.getstatic_count());
        System.out.println("・Bのインスタンス変数の中身は：" + B.getinstance_count());
        System.out.println("");
        
    }
}
