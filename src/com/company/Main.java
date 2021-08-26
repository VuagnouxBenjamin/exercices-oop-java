package com.company;

import com.company.clients.Clients;

public class Main {
    public static void main(String[] args) {
        //handling data
        Clients[] liste_clients = {
                new Clients("Weller", "Paul", "Baker Street", "Londres"),
                new Clients("Jack", "White", "Detroit"),
                new Clients("Les", "Claypool", "San Francisco"),
                new Clients("Johnny", "Thunders", "New York"),
        };

        // formatting output
        String tableFormat = "| %-14s | %-11s | %-13s | %-15s |%n";

        System.out.format("+----------------+-------------+---------------+-----------------+%n");
        System.out.format("|     Prenom     |     Nom     |    Adresse    |      Ville      |%n");
        System.out.format("+----------------+-------------+---------------+-----------------+%n");
        for (Clients client : liste_clients) {
            System.out.format(tableFormat, client.getPrenom(), client.getNom(), client.getAdresse(), client.getVille());
        }
        System.out.format("+----------------+-------------+---------------+-----------------+%n");
    }
}
