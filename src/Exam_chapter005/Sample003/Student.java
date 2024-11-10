package Exam_chapter005.Sample003;
public class Student {

    private String name;
    private int age;
    private int studentNo;

    //コンストラクタ
    public Student(String name,int age,int studentNo){
        this.name = name;
        this.age = age;
        this.studentNo = studentNo;
    }

    public void self(){
        System.out.println("・生徒名は「" + name + "」です。");
        System.out.println("・年齢は「" + age + "」です。");
        System.out.println("・生徒番号は「" + studentNo + "」です。");
    }

}
