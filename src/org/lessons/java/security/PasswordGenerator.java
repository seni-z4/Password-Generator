package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

  public String name;
  public String surname;
  public String colore;
  public int giorno;
  public int mese;
  public int anno;

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("inserici ti tuo nome");
    String primoNome = input.nextLine();

    System.out.println("inserici ti tuo cognome");
    String cognome = input.nextLine();

    System.out.println("inserici ti tuo colore preferito");
    String colore = input.nextLine();

    // spazio vuoto per il nextline
    String vuoto = input.nextLine();

    System.out.println("inserici ti tuo giorno di nascita");
    int day = input.nextInt();

    System.out.println("inserici ti tuo giorno di mese");
    int month = input.nextInt();

    System.out.println("inserici ti tuo giorno di anno");
    int year = input.nextInt();

    System.out
        .println("Ho un utente che si chiama " + primoNome + " " + cognome + " nato il " + day + "/" + month + "/"
            + year + ","
            + "il cui colore preferito è il " + colore + " La sua password sarà " + primoNome + "-" + cognome + "-" +
            (day + month + year));
  }
}
