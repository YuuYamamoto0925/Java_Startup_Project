package Exam_chapter002.Sample003;
public class Exec003 {
    
    //演算子と分岐文
    //if, if/else文の使用
    public static void main(String[] args) {

        int a = 10;

        System.out.println("【出力結果】");
        if(a>0){
            //aは0より大きい場合
            System.out.println("・aは「" + a + "」のため、「0」より大きいです");
        }else if(a==0){
            //aは0の場合
            System.out.println("・aは「" + a + "」です");
        }else{
            //それ以外の場合
            System.out.println("・aは「" + a + "」のため、「0」より小さいです");
        }

    }
}
