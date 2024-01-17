package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            ServerSocket s = new ServerSocket(1111);

            Socket connection = s.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            DataOutputStream scrivi = new DataOutputStream(connection.getOutputStream());
            Alunno a = new Alunno("Giorgio", "Ponti", "09/09/2003");
            Alunno a1 = new Alunno("Serena", "Valentini", "05/09/2005");
            Alunno a2 = new Alunno("Davide", "xie", "06/09/2004");
            Classe c1 = new Classe(5, "A", "05-TW");
            c1.aggiungiStudente(a);
            c1.aggiungiStudente(a1);
            c1.aggiungiStudente(a2);

            scrivi.writeBytes(c1.toString());
            ObjectMapper objectMapper = new ObjectMapper();
            // Serializzazione su stringa
            

        // Serializzazione su stringa
        String s2 = objectMapper.writeValueAsString(a);
        System.out.println(s2);



            s.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}