package Exam_chapter002.Sample001;
public class Exec001 {
    
    //演算子と分岐文
    //各種演算子の使用
    public static void main(String[] args) {

        //算術演算子
        int a = 10;
        int b = 3;

        System.out.println("【出力結果：算術演算子】");
        System.out.println("・足し算：" + a + "+" + b + "=" + (a+b));
        System.out.println("・引き算：" + a + "-" + b + "=" + (a-b));
        System.out.println("・かけ算：" + a + "×" + b + "=" + (a*b));
        System.out.println("・割り算：" + a + "÷" + b + "=" + (a/b));
        System.out.println("・余り：" + a + "%" + b + "=" + (a%b));
        System.out.println("");

        //比較演算子
        int x = 10;
        int y = 5;

        System.out.println("【出力結果：比較演算子】");
        System.out.println("・条件(" + x + "==" + y + ")：" + (x==y));
        System.out.println("・条件(" + x + "!=" + y + ")：" + (x!=y));
        System.out.println("・条件(" + x + ">" + y + ")：" + (x>y));
        System.out.println("・条件(" + x + "<" + y + ")：" + (x<y));
        System.out.println("・条件(" + x + ">=" + y + ")：" + (x>=y));
        System.out.println("・条件(" + x + "<=" + y + ")：" + (x<=y));
        System.out.println("");
        
        //論理演算子
        boolean t = true;
        boolean f = false;

        System.out.println("【出力結果：論理演算子】");
        System.out.println("・条件(" + t + "&&" + f + ")：" + (t&&f));
        System.out.println("・条件(" + t + "||" + f + ")：" + (t||f));
        System.out.println("・条件(!" + f + ")：" + (!f));
        System.out.println("");

        //代入演算子
        int s = 10;

        System.out.println("【出力結果：代入演算子】");
        System.out.println("・代入演算子(s+=3)：" + (s+=3));
        System.out.println("・代入演算子(s-=3)：" + (s-=3));
        System.out.println("・代入演算子(s*=3)：" + (s*=3));
        System.out.println("・代入演算子(s/=3)：" + (s/=3));
        System.out.println("・代入演算子(s%=3)：" + (s%=3));
        System.out.println("");

    }
}
