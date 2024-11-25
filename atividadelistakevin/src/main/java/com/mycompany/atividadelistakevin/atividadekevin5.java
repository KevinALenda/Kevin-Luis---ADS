/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadelistakevin;

/**
 *
 * @author kkevi
 */
public class atividadekevin5 {
    
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        somaLinhasMatriz(matriz);
    }
    public static void somaLinhasMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }

            System.out.println("Linha " + i + ": Soma = " + soma);
        }
    }
}
