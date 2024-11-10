package Exam_chapter004.Sample003;

public class NintendoDS extends Game{

    private final static String GameName = "NintendoDS";

    @Override
    public void play(){
        System.out.println("・" + GameName + "をプレイします。");
        System.out.println("・おすすめはポケットモンスターブラック/ホワイトです。");
    }
    
}
