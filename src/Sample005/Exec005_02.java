package Sample005;

public class Exec005_02 {

    //Javaの配列
    //多次元配列の宣言

    public static void main(String[] args){
        
        int[][] a = { {1,2} , {3,4} };
        int[][] b = new int[2][2];

        b[0][0] = 1;
        b[0][1] = 2;
        b[1][0] = 3;
        b[1][1] = 4;

        System.out.println("【多次元配列の中身を確認する】");
        System.out.println("・配列a[0][0]の要素は「" + a[0][0] + "」です");
        System.out.println("・配列a[0][1]の要素は「" + a[0][1] + "」です");
        System.out.println("・配列b[1][0]の要素は「" + b[1][0] + "」です");
        System.out.println("・配列b[1][1]の要素は「" + b[1][1] + "」です");

        System.out.println("【多次元配列の中身をfor文を使用し、すべての要素を確認する】");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println("・配列a[" + i + "][" + j + "]の要素は「" + a[i][j] + "」です");
            }
        }

        System.out.println("【多次元配列の中身を拡張for文を使用し、すべての要素を確認する】");
        int rowIndex = 0;   //配列の行数
        int colIndex;       //配列の列数
        for (int[] row : b) {
            colIndex = 0;
            for (int n : row) {
                System.out.println("・配列b[" + rowIndex + "][" + colIndex + "]の要素は「" + n + "」です");
                colIndex++;
            }
            rowIndex++;
        }

    }
    
}
