package Sample004;

public class Exec004_04 {

    //Javaの繰り返し処理
    //while文の書き方

    public static void main(String[] args){

        int count = 0;
        int a = 0;

        while(a<5){
            System.out.println("aは「" + a + "」です");
            a++;
            count++;
        }

        System.out.println("while文処理は「" + count + "」回処理されました");
        
    }
    
}
