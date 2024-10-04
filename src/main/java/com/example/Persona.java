package com.example;

public class Persona extends Thread{
    private Cestino cestino;
    private int monete;

    public Persona(Cestino cestino, int monete){
        this.cestino = cestino;
        this.monete = monete;
    }

    public void run(){
        for(int i = 0; i < monete; i++){
            cestino.aggiungiMoneta();
        }
    }
}
