package Exam_chapter006.Sample006.NINTENDO;
import Exam_chapter006.Sample006.Game.GameDevice;

public class NINTENDO64 extends GameDevice {

    private String Games;

    public NINTENDO64(String Games){
        this.Games = Games;
    }

    @Override
    public void play(){
        System.out.println("・任天堂64で遊ぶ。");
    }

    public void GamesPlay64(){
        System.out.println("・ゲームソフトは「" + Games + "」です。");
    }

}
