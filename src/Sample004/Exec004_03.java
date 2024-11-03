package Sample004;

public class Exec004_03 {

    //Javaの繰り返し処理
    //do~while文の書き方

    public static void main(String[] args){

        int count = 0;
        int a = 0;

        do{
            //【重要】do~while文は、初回ループについてwhile条件関係なく必ず処理される
            System.out.println("aは「" + a + "」です");
            a++;
            count++;
        }while(a<5);

        System.out.println("do~while文処理は「" + count + "」回処理されました");

    }
    
}
