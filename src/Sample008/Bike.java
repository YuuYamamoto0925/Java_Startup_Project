package Sample008;

public class Bike extends Vehicle {

    //コンストラクタ(継承先のコンストラクタを呼び出す)
    public Bike(String Bike_Name,String Bike_Maker){
        super(Bike_Name,Bike_Maker);
    }

    //バイクだけが行える動作を返す
    @Override
    public String unique(){
        return "押して移動ができる。";
    }

}
