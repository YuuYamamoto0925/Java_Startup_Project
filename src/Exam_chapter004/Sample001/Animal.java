package Exam_chapter004.Sample001;

//Animalという抽象クラスの定義
public abstract class Animal {
    
    private String name;

    //コンストラクタ
    public Animal(String name){
        this.name = name;
    }

    //抽象メソッド
    public abstract void eat();

    //具象メソッド
    public void self(){
        System.out.println("・動物は「" + name + "」という名前です。");
    }

    //具象メソッド
    public String getName(){
        return name;
    }

}
