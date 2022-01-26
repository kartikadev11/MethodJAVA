package com.macamMethodJava;

public class MethodPengembalian {
    public static int HitungKali(){ // method pengembalian ditandai dengan ada tipe data di samping kiri nama method
        int a = 4;
        int b = 5;
        int kali;
        kali = a*b;
        return kali;

    }

    public static void main(String[] args) {
        int myhitung;
        myhitung = HitungKali();
        System.out.println(myhitung);
    }
}
