package Sample004;

public class Exec004_01 {

    //Javaの繰り返し処理
    //for文の書き方

    public static void main(String[] args){

        int count = 0;
        
        System.out.println("繰り返し処理を開始します");
        for(int i=1;i<11;i++){
            System.out.println("iは現在「" + i + "」です");
            count++;
        }

        System.out.println("for文の処理は「" + count + "」回処理されました");

    }
    
}
