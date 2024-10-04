package com.example;

public class Cavallo extends Thread implements Comparable<Cavallo>{
    private int numCavallo;
    public int getNumCavallo() {
        return numCavallo;
    }

    private static int distanza = 200;
    private int tempo;

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }


    public Cavallo(int num){
        this.numCavallo = num;
    }

    public void run(){

        setTempo((int) (Math.random() * 1000));

        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return "numero: " + numCavallo + "tempo: " + tempo;
    }

    @Override
    public int compareTo(Cavallo o) {
        return this.tempo - o.getTempo();
    }
    
}
