package Exam_chapter003.Sample004;
public class Exec004 {
    
    //ループ文
    //ループのネスティング
    public static void main(String[] args) {

        int[][] a = { {1,2} , {3,4} };

        System.out.println("【多次元配列の中身をfor文を使用し、すべての要素を確認する】");
        
        //外側のfor文
        for(int i=0;i<a.length;i++){
            //内側のfor文
            for(int j=0;j<a[i].length;j++){
                System.out.println("・配列a[" + i + "][" + j + "]の要素は「" + a[i][j] + "」です");
            }
        }
        System.out.println("");

    }
}
