package Exam_chapter003.Sample002;
public class Exec002 {
    
    //ループ文
    //for文および拡張for文の使用
    public static void main(String[] args) {

        String[] fruit = new String[5];
        fruit[0] = "りんご";
        fruit[1] = "ぶどう";
        fruit[2] = "みかん";
        fruit[3] = "すいか";
        fruit[4] = "いちご";

        System.out.println("【繰り返し処理(for文)を開始します】");
        //for文
        for(int i=0;i<fruit.length;i++){
            System.out.println("・配列の" + i + "番目には「" + fruit[i] + "」が格納されている。");
        }
        System.out.println("");
        
        System.out.println("【繰り返し処理(拡張for文)を開始します】");
        //拡張for文
        for(String n:fruit){
            System.out.println("・配列には「" + n + "」が格納されている。");
        }
        System.out.println("");


    }
}
