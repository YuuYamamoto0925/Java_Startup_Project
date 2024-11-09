package Sample008;

public class Vehicle {

    private String Vehicle_Name = null;
    private String Vehicle_Maker = null;

    //コンストラクタ
    public Vehicle(String Vehicle_Name,String Vehicle_Maker){
        this.Vehicle_Name = Vehicle_Name;
        this.Vehicle_Maker = Vehicle_Maker;
    }

    //乗り物の名前を返す
    public String getVehicle_Name(){
        return Vehicle_Name;
    }

    //乗り物の生産メーカーを返す
    public String getVehicle_Maker(){
        return Vehicle_Maker;
    }

    //乗り物の動作を返す
    public String speed(){
        return "アクセルを操作をする。";
    }

    //乗り物だけが行える動作を返す
    //(子クラスでオーバーライドする)
    public String unique(){
        return "乗り物だけが行える動作を返す。";
    }
    
}
