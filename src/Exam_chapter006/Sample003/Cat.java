package Exam_chapter006.Sample003;

public class Cat extends Animal implements AnimalAction{

    //親クラスのメソッドを再定義
    @Override
    public void bark(){
        System.out.println("・ねこは鳴く。");
    };

    //インターフェースのメソッドを再定義
    @Override
    public void action(){
        System.out.println("・ねこは爪を研ぐ。");
    }

}
