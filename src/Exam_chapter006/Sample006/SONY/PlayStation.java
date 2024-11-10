package Exam_chapter006.Sample006.SONY;
import Exam_chapter006.Sample006.Game.GameDevice;

public class PlayStation extends GameDevice {

    private String Games;

    public PlayStation(String Games){
        this.Games = Games;
    }

    @Override
    public void play(){
        System.out.println("・プレイステーションで遊ぶ。");
    }

    public void GamesPlayStation(){
        System.out.println("・ゲームソフトは「" + Games + "」です。");
    }

}
