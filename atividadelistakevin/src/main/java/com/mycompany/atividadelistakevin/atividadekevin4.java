/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadelistakevin;

import java.util.Arrays;
/**
 *
 * @author kkevi
 */
public class atividadekevin4 {
    
public static int[] ordenaVetor(int[] vetor) {
        Arrays.sort(vetor);
        return vetor;  
    }

    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 3};

        int[] vetorOrdenado = ordenaVetor(numeros);

        System.out.println("Vetor ordenado: " + Arrays.toString(vetorOrdenado));
    }
}
