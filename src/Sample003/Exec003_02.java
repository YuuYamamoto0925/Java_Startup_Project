package Sample003;

public class Exec003_02 {

    //Javaの条件分岐
    //switch文の書き方
    public static void main(String[] args) {

        int a = 1;

        switch (a) {
        case 1:
            //aが1の場合
            System.out.println("aは1です");
            break;
        case 2:
            //aが2の場合
            System.out.println("aは2です");
            break;
        case 3:
            //aが3の場合
            System.out.println("aは3です");
            break;
            //aが1~3のいずれでもない場合
        default:
            System.out.println("それ以外の値です");
        }

    }

}
