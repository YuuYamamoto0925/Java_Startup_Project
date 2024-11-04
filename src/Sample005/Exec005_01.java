package Sample005;

import java.util.concurrent.atomic.AtomicInteger;

public class Exec005_01 {

    //Javaの配列
    //配列の宣言

    public static void main(String[] args){

        int[] a = {1,2,3,4,5};
        int[] b = new int[5];

        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        b[4] = 5;

        System.out.println("【配列の中身を確認する】");
        System.out.println("・配列aの1つ目の要素は「" + a[0] + "」です");
        System.out.println("・配列aの2つ目の要素は「" + a[1] + "」です");

        System.out.println("・配列bの3つ目の要素は「" + b[2] + "」です");
        System.out.println("・配列bの4つ目の要素は「" + b[3] + "」です");

        System.out.println("【配列の中身をfor文を使用し、すべての要素を確認する】");
        for(int i=0;i<a.length;i++){
            System.out.println("・配列aの" + (i+1) + "つ目の要素は「" + a[i] + "」です");
        }

        System.out.println("【配列の中身を拡張for文を使用し、すべての要素を確認する】");
        AtomicInteger index = new AtomicInteger(1);     //AtomicIntegerクラスを利用し、拡張for文の処理数をカウントする
        for(int i:b){
            System.out.println("・配列bの" + index.getAndIncrement() + "つ目の要素は「" + i + "」です");
        }

    }
    
}
