package com.mycompany.conversio;

import java.util.Scanner;

public class conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix en £");
        double valorLliures = sc.nextDouble();

        double tipusDeCanvi = 1.15d;
        double valorEuros = valorLliures / tipusDeCanvi;

        System.out.println(valorLliures + " lliures esterlines (£) actualment equivalen a " + valorEuros + " euros (€)");
    }
}
