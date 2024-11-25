/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadelistakevin;

/**
 *
 * @author kkevi
 */
public class atividadekevin3 {
    
    public static void imprimeVetorString(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { 
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) { 
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(", "); 
                }
            }
            System.out.println("]"); 
        }
    }

    public static void main(String[] args) {
        String[][] nomes = {
            {"Julia", "Gabriela", "Lidia"},
            {"Leticia", "Kevin"},
            {"Bruna", "Vitor", "Diego", "William"}
        };
        imprimeVetorString(nomes); 
    }
}

