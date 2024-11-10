package Exam_chapter006.Sample001;
public class Exec001 {
    
    //継承とポリモフィズム
    //サブクラスの定義と使用

    public static void main(String[] args) {

        Cat animal = new Cat();

        System.out.println("【出力結果】");
        animal.eat();   //親クラスのメソッドを使用
        animal.bark();  //子クラスのメソッドを使用
        
    }
}
