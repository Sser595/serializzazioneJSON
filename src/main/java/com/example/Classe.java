package com.example;
import java.util.ArrayList;

public class Classe {
    
    public int numero;
    public String sezione;
    public String aula;
    public ArrayList<Alunno> alunni;


    public Classe(int numero, String sezione, String aula) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return this.sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getAlunni() {
        return this.alunni;
    }

    public void setAlunni(ArrayList<Alunno> alunni) {
        this.alunni = alunni;
    }

    public void aggiungiStudente(Alunno a){
        alunni.add(a);
    }


}