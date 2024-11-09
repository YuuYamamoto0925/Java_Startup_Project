package Sample008;

public class Exec008_01 {

    //Javaの継承とポリモフィズム
    //親クラスと子クラス(継承)
    public static void main(String[] args){

        //車クラスを生成
        String car_name = "プリウス";
        String car_maker = "トヨタ";
        Car car = new Car(car_name,car_maker);

        System.out.println("【車の確認】");
        System.out.println("・車の名前：" + car.getVehicle_Name());          //親クラスVehicleのメソッド
        System.out.println("・車のメーカー：" + car.getVehicle_Maker());     //親クラスVehicleのメソッド
        System.out.println("・車の操作：" + car.speed());                    //親クラスVehicleのメソッド
        System.out.println("・車だけが行える動作を返す：" + car.unique());     //子クラスでオーバーライドしたVehicleのメソッド
        System.out.println("");

        //バイククラスを生成
        String bike_name = "スーパーカブ50";
        String bike_maker = "HONDA";
        Bike bike = new Bike(bike_name,bike_maker);

        System.out.println("【バイクの確認】");
        System.out.println("・バイクの名前：" + bike.getVehicle_Name());          //親クラスVehicleのメソッド
        System.out.println("・バイクのメーカー：" + bike.getVehicle_Maker());     //親クラスVehicleのメソッド
        System.out.println("・バイクの操作：" + bike.speed());                    //親クラスVehicleのメソッド
        System.out.println("・バイクだけが行える動作を返す：" + bike.unique());     //子クラスでオーバーライドしたVehicleのメソッド
        System.out.println("");
        
    }
    
}
