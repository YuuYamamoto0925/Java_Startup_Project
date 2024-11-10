package Exam_chapter005.Sample005;

public class Count {

    //static変数(静的変数)
    private static int static_count = setstatic_count();

    //インスタンス変数
    private int instance_count = 0;

    //コンストラクタ
    public Count(int instance_count){
        this.instance_count = instance_count;
        static_count++;
    }
    
    //staticメソッド(静的メソッド)
    private static int setstatic_count(){
        return 50;
    }

    //インスタンスメソッド    
    public int getstatic_count(){
        return static_count;
    }

    //インスタンスメソッド
    public int getinstance_count(){
        return instance_count;
    }

}
