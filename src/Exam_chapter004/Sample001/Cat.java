package Exam_chapter004.Sample001;

//Catという抽象クラスとインターフェースを実装した具象クラスの定義
public class Cat extends Animal implements AnimalAction{

    private String type = "ねこ";

    //コンストラクタ
    public Cat(String name){
        super(name);
    }

    //抽象クラス(Animal)の抽象メソッドを実装する
    @Override
    public void eat(){
        String n = super.getName();
        System.out.println("・" + type + "の「" + n + "」はキャットフードを食べます。");
    }

    //インターフェース(AnimalAction)の抽象メソッドを実装する
    @Override
    public void action(){
        String n = super.getName();
        System.out.println("・" + type + "の「" + n + "」は爪を研いでいます。");
    }


}
