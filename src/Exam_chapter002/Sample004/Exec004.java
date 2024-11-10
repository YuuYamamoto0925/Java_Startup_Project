package Exam_chapter002.Sample004;
public class Exec004 {
    
    //演算子と分岐文
    //switch文の使用
    public static void main(String[] args) {

        int a = 1;

        System.out.println("【結果出力】");
        switch (a) {
        case 1:
            //aが1の場合
            System.out.println("・aは1です");
            break;
        case 2:
            //aが2の場合
            System.out.println("・aは2です");
            break;
        case 3:
            //aが3の場合
            System.out.println("・aは3です");
            break;
            //aが1~3のいずれでもない場合
        default:
            System.out.println("・それ以外の値です");
        }

    }
}
