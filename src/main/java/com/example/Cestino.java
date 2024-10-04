package com.example;

public class Cestino {
    private int contatore;
    
    public Cestino(int contatore){
        this.contatore = contatore;
    }

    public int getContatore() {
        return contatore;
    }

    synchronized public void aggiungiMoneta(){ //synchronized aspetta che questa istruzione venga eseguita completamente da un thread prima di passare la cpu ad un altro thread
        contatore = contatore + 1;
    }
    
}
