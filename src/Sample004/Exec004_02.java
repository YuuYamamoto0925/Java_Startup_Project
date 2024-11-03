package Sample004;

public class Exec004_02 {

    //Javaの繰り返し処理
    //for文2重ループの書き方

    public static void main(String[] args){

        int count = 0;
        int count_all = 0;

        System.out.println("繰り返し処理を開始します");
        
        //通常for文
        for(int i=1;i<=3;i++){
            //2重for文
            for(int j=1;j<=3;j++){
                System.out.println(i + "-" + j + "回目の処理：" + i + "+" + j + "=" + (i+j));
                count_all++;
            }
            count++;
        }

        System.out.println("for文処理は「" + count + "」回処理されました");
        System.out.println("for文2重ループ処理は「" + count_all + "」回処理されました");

    }
    
}
