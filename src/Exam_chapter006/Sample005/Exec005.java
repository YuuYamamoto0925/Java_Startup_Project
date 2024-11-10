package Exam_chapter006.Sample005;
public class Exec005 {
    
    //継承とポリモフィズム
    //参照型の型変換

    public static void main(String[] args) {

        //アップキャスト
        Animal cat = new Cat();
        Animal dog = new Dog();

        System.out.println("【出力結果】");
        System.out.println("<ねこの情報>");
        cat.eat();
        //ダウンキャスト
        if(cat instanceof Cat){
            Cat castCat = (Cat)cat;
            castCat.actionCat();    //Catクラスのみ持つactionCat()を呼び出せる
        }
        System.out.println("");

        System.out.println("<いぬの情報>");
        dog.eat();
        //ダウンキャスト
        if(dog instanceof Dog){
            Dog castDog = (Dog)dog;
            castDog.actionDog();    //Dogクラスのみ持つactionDog()を呼び出せる
        }
        System.out.println("");
        

    }
}
