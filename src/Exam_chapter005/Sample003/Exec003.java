package Exam_chapter005.Sample003;
public class Exec003 {
    
    //クラスの定義とオブジェクトの使用
    //コンストラクタの定義

    public static void main(String[] args) {

        String name = "たなかたろう";
        int age = 18;
        int studentNo = 10;

        Student st = new Student(name,age,studentNo);
        System.out.println("【出力結果】");
        st.self();
    }
}
