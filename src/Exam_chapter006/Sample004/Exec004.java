package Exam_chapter006.Sample004;
public class Exec004 {
    
    //継承とポリモフィズム
    //ポリモフィズムを使用するコードの作成
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();

        Animal[] animal_list = {cat,dog};

        System.out.println("【出力結果】");
        //ポリモーフィズムを利用して、同じメソッドを異なるオブジェクトで呼び出す
        for(Animal al: animal_list){
            al.eat();
        }
        System.out.println("");

    }
}
