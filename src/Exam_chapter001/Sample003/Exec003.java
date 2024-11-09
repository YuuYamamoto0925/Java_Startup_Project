package Exam_chapter001.Sample003;

import java.util.concurrent.atomic.AtomicInteger;

public class Exec003 {
    
    //データの宣言と使用
    //配列（一次元配列）の宣言と作成、使用
    public static void main(String[] args){

        //配列の宣言
        int[] a = {10,20,30,40,50};
        int[] b = new int[5];

        b[0] = 15;
        b[1] = 25;
        b[2] = 35;
        b[3] = 45;
        b[4] = 55;

        System.out.println("【配列の中身を確認する】");
        System.out.println("・配列aの1つ目の要素は「" + a[0] + "」です");
        System.out.println("・配列aの2つ目の要素は「" + a[1] + "」です");

        System.out.println("・配列bの3つ目の要素は「" + b[2] + "」です");
        System.out.println("・配列bの4つ目の要素は「" + b[3] + "」です");
        System.out.println("");

        System.out.println("【配列の中身をfor文を使用し、すべての要素を確認する】");
        for(int i=0;i<a.length;i++){
            System.out.println("・配列aの" + (i+1) + "つ目の要素は「" + a[i] + "」です");
        }
        System.out.println("");

        System.out.println("【配列の中身を拡張for文を使用し、すべての要素を確認する】");
        AtomicInteger index = new AtomicInteger(1);     //AtomicIntegerクラスを利用し、拡張for文の処理数をカウントする
        for(int i:b){
            System.out.println("・配列bの" + index.getAndIncrement() + "つ目の要素は「" + i + "」です");
        }
        System.out.println("");

    }
}
