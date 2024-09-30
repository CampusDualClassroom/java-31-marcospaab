package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {

    public static void main(String[] args){
        String cadena="";


        FileReader fr = null;
        try {
            fr = new FileReader("src/main/resources/lorem.txt");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader b = new BufferedReader(fr);
        while(true){
            try {
                if (!((cadena = b.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(cadena);
        }
        try {
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
