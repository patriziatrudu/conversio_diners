
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author patri
 package com.mycompany.conversio;

import java.util.Scanner;

/**
 *
 * @author nil
 */
public class conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 1.15d;
        System.out.println(valor_euros + " eur0s (€) acatualmentt ewuivalen a" + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
    }
}
