package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestBonus {
    public static void main(String[] args) {
        String listaInvitati[] = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Come ti chiami?");
        String nomeInvitato = scanner.nextLine();

        System.out.println(nomeInvitato);

        scanner.close();

        boolean trovato = false;
        int i = 0;

        while (trovato == false && i < listaInvitati.length){
            if (nomeInvitato.equals(listaInvitati[i])) {
                trovato = true;
            }
            
            System.out.println(listaInvitati[i]);
            i++;
        }
        
        String messaggio = "Non puoi entrare!";
        if (trovato == true) {
            messaggio = "Puoi entrare!";
        }
         System.out.println(messaggio);



        

    }
}
