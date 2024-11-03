package Sample003;

public class Exec003_01 {

    //Javaの条件分岐
    //if分の書き方
    public static void main(String[] args) {

        int a = 10;

        if(a>0){
            //aは0より大きい場合
            System.out.println("aは「" + a + "」のため、「0」より大きいです");
        }else if(a==0){
            //aは0の場合
            System.out.println("aは「" + a + "」です");
        }else{
            //それ以外の場合
            System.out.println("aは「" + a + "」のため、「0」より小さいです");
        }

    }

}
