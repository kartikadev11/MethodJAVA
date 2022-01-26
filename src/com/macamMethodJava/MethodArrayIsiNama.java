package com.macamMethodJava;

import java.util.Scanner;

public class MethodArrayIsiNama {

    private static void cetakIsiNama(String [] nama){
        for (int InputNama = 0; InputNama < nama.length; InputNama++){
            System.out.println("nama index ke- "+InputNama + " adalah "+ nama[InputNama]);
//            System.out.println(nama[InputNama]);
        }

    }


    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String[] mynama = new String[6];
        
        for (int s = 0; s < mynama.length;s++){
            System.out.println("Masukkan Nama ");
            String nama = i.nextLine();
            mynama [s] = nama;
        }
        cetakIsiNama(mynama);
    }

}
