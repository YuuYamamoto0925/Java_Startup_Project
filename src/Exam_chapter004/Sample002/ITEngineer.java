package Exam_chapter004.Sample002;
public class ITEngineer {

    private String name;    //技術者の名前
    private int age;        //技術者の年齢
    private String[] programming_Language;  //技術者の習得プログラミング言語
    private String[] experience_OS;         //技術者の利用できるOS

    //コンストラクタ
    public ITEngineer(String name,int age,String[] programming_Language,String[] experience_OS){
        this.name = name;
        this.age = age;
        this.programming_Language = programming_Language;
        this.experience_OS = experience_OS;
    }

    //技術者の名前を返す
    public String getName(){
        return name;
    }

    //技術者の年齢を返す
    public int getAge(){
        return age;
    }

    //技術者の習得プログラミング言語を返す
    public String[] getPLanguage(){
        return programming_Language;
    }

    //技術者の利用できるOS
    public String[] getEOS(){
        return experience_OS;
    }

}
