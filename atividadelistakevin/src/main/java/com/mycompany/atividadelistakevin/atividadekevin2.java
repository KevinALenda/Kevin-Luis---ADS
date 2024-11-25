/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadelistakevin;

/**
 *
 * @author kkevi
 */
public class atividadekevin2 {
    
    public static void imprimeVetorInt(int[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", "); 
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; 
        imprimeVetorInt(numeros);
    }
}
