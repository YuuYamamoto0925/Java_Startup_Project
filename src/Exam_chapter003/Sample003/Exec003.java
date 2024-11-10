package Exam_chapter003.Sample003;
public class Exec003 {
    
    //ループ文
    //do-while文の作成と使用
    public static void main(String[] args) {

        int count = 0;
        int a = 0;

        System.out.println("【繰り返し処理を開始します】");
        
        //do~while文
        do{
            //【重要】do~while文は、初回ループについてwhile条件関係なく必ず処理される
            System.out.println("・aは「" + a + "」です");
            a++;
            count++;
        }while(a<5);

        System.out.println("(do~while文処理は「" + count + "」回処理されました)");
        System.out.println("");


    }
}
