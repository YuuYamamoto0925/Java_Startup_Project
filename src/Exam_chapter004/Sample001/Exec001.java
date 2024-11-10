package Exam_chapter004.Sample001;
public class Exec001 {
    
    //オブジェクト指向の概念
    //具象クラス、抽象クラス、インタフェース

    public static void main(String[] args) {

        Cat A = new Cat("たま");
        Dog B = new Dog("ぽち");

        System.out.println("【結果出力】");
        A.self();       //抽象クラス(Animal)で実装したself()が呼び出される。
        A.eat();        //具象クラス(Cat)で実装したeat()が呼び出される。
        A.action();     //具象クラス(Cat)で実装したaction()が呼び出される。
        System.out.println("");

        System.out.println("【結果出力】");
        B.self();       //抽象クラス(Animal)で実装したself()が呼び出される。
        B.eat();        //具象クラス(Dog)で実装したeat()が呼び出される。
        B.action();     //具象クラス(Dog)で実装したaction()が呼び出される。
        System.out.println("");
        
    }
}
