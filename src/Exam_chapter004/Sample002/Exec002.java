package Exam_chapter004.Sample002;

import java.util.Objects;

public class Exec002 {
    
    //オブジェクト指向の概念
    //データ隠蔽(いんぺい)とカプセル化
    public static void main(String[] args) {

        String name_A = "やまだたろう";
        int age_A = 25;
        String[] pl_A = {"Java","SQL","PowerShell","PHP","C#"};
        String[] eOS_A = {"Windows","Linux"};

        String name_B = "すずきはなこ";
        int age_B = 24;
        String[] pl_B = {"Ruby","SQL"};
        String[] eOS_B = {"Mac"};

        //インスタンスオブジェクトを生成し、カプセル化を行う
        ITEngineer ITE_A = new ITEngineer(name_A, age_A, pl_A, eOS_A);
        ITEngineer ITE_B = new ITEngineer(name_B, age_B, pl_B, eOS_B);
        ITEngineer[] ITE_LIST = {ITE_A,ITE_B};

        System.out.println("【出力結果】");      
        //カプセル化されたオブジェクトの情報(ITエンジニア情報)を出力する
        for(int i=0;i<ITE_LIST.length;i++){
            System.out.println("<" + (i+1) + "人目の情報>");

            String name = ITE_LIST[i].getName();
            int age = ITE_LIST[i].getAge();
            String[] pl = ITE_LIST[i].getPLanguage();
            String[] eOS = ITE_LIST[i].getEOS();

            System.out.println("・技術者の名前は「" + name + "」です。");
            System.out.println("・技術者の年齢は「" + age + "」です。");

            if(!(Objects.isNull(pl))){
                System.out.println("・技術者が習得しているプログラミング言語です。");
                System.out.print("  (");
                for(int l=0;l<pl.length;l++){
                    if(pl.length==(l+1)){
                        System.out.println(pl[l] + ")");
                    }else{
                        System.out.print(pl[l] + ",");
                    }
                }
            }

            if(!(Objects.isNull(eOS))){
                System.out.println("・技術者が使用できるOSです。");
                System.out.print("  (");
                for(int o=0;o<eOS.length;o++){
                    if(eOS.length==(o+1)){
                        System.out.println(eOS[o] + ")");
                    }else{
                        System.out.print(eOS[o] + ",");
                    }
                }
            }

            System.out.println("");

        }

    }

}
