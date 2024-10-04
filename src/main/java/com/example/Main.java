package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        int cavalli = 20;

        ArrayList<Cavallo> gara = new ArrayList<>();

        for(int i = 0; i < cavalli; i++){
            gara.add(new Cavallo((i+1)));
        }

        for(int i = 0; i < cavalli; i++){
            gara.get(i).start();
        }

        for(int i = 0; i < cavalli; i++){
            gara.get(i).join();
        }

        ArrayList<Cavallo> classifica = new ArrayList<>();
        classifica = gara;

        Collections.sort(classifica);
        for(int i = 0; i < classifica.size(); i++){
            System.out.println("posizione: " + (i+1) + " numero: " + classifica.get(i).getNumCavallo() + " tempo: " + classifica.get(i).getTempo());
        }


    }
}
