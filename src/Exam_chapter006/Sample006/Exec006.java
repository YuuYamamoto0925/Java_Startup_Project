package Exam_chapter006.Sample006;

import Exam_chapter006.Sample006.Game.GameDevice;
import Exam_chapter006.Sample006.NINTENDO.NINTENDO64;
import Exam_chapter006.Sample006.SONY.PlayStation;

public class Exec006 {
    
    //継承とポリモフィズム
    //パッケージ宣言とインポート

    public static void main(String[] args) {

        GameDevice nintendo = new NINTENDO64("ポケモンスタジアム");
        GameDevice sony = new PlayStation("トロとなつやすみ");

        System.out.println("【出力結果】");
        System.out.println("<ゲーム機その1>");
        nintendo.play();
        //ダウンキャスト
        if(nintendo instanceof NINTENDO64){
            NINTENDO64 cast64 = (NINTENDO64)nintendo;
            cast64.GamesPlay64();     //NINTENDO64クラスのみ持つGames64()を呼び出せる
        }
        System.out.println("");

        System.out.println("<ゲーム機その2>");
        sony.play();
        //ダウンキャスト
        if(sony instanceof PlayStation){
            PlayStation castplst = (PlayStation)sony;
            castplst.GamesPlayStation();     //PlayStationクラスのみ持つGamesPlayStation()を呼び出せる
        }
        System.out.println("");

    }
}
