package Exam_chapter002.Sample002;
public class Exec002 {
    
    //演算子と分岐文
    //演算子の優先順位
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 3;
        int result;
        
        System.out.println("【出力結果】");
        result = a + b * c;
        System.out.println("・" + a + "+" + b + "×" + c + "=" + result);
        result = (a + b) * c;
        System.out.println("・("+ a + "+" + b + ")×" + c + "=" + result);
        
    }
}
