package com.macamMethodJava;

public class MethodParsingg {
    public static int hitungKali(int a, int b, String Judul){
        String Judul1 = Judul;
        return a*b;
    }

    public static void main(String[] args) {
        int hitung;
        hitung = hitungKali(3,5,"Hitung");
        System.out.println(hitung);
    }
}
