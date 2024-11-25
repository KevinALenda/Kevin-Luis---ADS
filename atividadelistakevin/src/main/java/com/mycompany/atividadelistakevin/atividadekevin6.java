/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadelistakevin;

/**
 *
 * @author kkevi
 */
public class atividadekevin6 {
    
    public static void main(String[] args) {
    int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        somaColunasMatriz(matriz);
    }
    public static void somaColunasMatriz(int[][] matriz) {
        if (matriz.length == 0) {
            System.out.println("Matriz vazia.");
            return;
        }

        int numColunas = matriz[0].length;

        for (int j = 0; j < numColunas; j++) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }
            System.out.println("Coluna " + j + ": Soma = " + soma);
        }
    }
}
