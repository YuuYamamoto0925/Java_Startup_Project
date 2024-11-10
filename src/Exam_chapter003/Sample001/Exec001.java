package Exam_chapter003.Sample001;
public class Exec001 {
    
    //ループ文
    //while文の使用
    public static void main(String[] args) {

        int count = 0;
        int a = 0;

        System.out.println("【繰り返し処理を開始します】");
        //while文
        while(a<5){
            System.out.println("・aは「" + a + "」です");
            a++;
            count++;
        }

        System.out.println("(while文処理は「" + count + "」回処理されました)");
        System.out.println("");
        
    }
}
