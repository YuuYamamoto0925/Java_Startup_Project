package Exam_chapter006.Sample002;
public class Cat extends Animal {

    //親クラスの定義を再定義する
    @Override
    void bark() {
        System.out.println("・ねこは「にゃー」と鳴く。");
    }

}
