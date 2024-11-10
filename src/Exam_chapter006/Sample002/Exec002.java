package Exam_chapter006.Sample002;
public class Exec002 {
    
    //継承とポリモフィズム
    //メソッドのオーバーライド(子クラスは親クラスのメソッドを再定義できる)

    public static void main(String[] args) {

        Animal myCat = new Cat();
        Animal myDog = new Dog();
        
        System.out.println("【出力結果】");
        myCat.bark();
        myDog.bark();

    }
}
