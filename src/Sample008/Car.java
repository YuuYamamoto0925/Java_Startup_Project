package Sample008;

public class Car extends Vehicle {

    //コンストラクタ(継承先のコンストラクタを呼び出す)
    public Car(String Car_Name,String Car_Maker){
        super(Car_Name,Car_Maker);
    }

    //車だけが行える動作を返す
    @Override
    public String unique(){
        return "ドアを開く。";
    }

}
