package Exam_chapter005.Sample002;
public class Exec002 {
    
    //クラスの定義とオブジェクトの使用
    //メソッドのオーバーロード(同じメソッド名で引数の型や数が異なる場合、呼び出すべきメソッドを判断する)
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int ans;

        Math math = new Math();
        System.out.println("【出力結果】");
        ans = math.add(a,b);
        System.out.println("・" + ans);
        
        ans = math.add(a,b,c);
        System.out.println("・" + ans);

        ans = math.add(a,b,c,d);
        System.out.println("・" + ans);

    }
}
