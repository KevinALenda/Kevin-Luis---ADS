/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadelistakevin;

/**
 *
 * @author kkevi
 */
public class Atividadelistakevin {

 public static void main(String[] args) {
        System.out.println(divisão(10, 2)); 
        System.out.println(divisão(10, 0)); 
    }

    public static double divisão(double dividendo, double divisor) {
        if (divisor == 0) {
            return 0.0; 
        } else {
            return dividendo / divisor; 
        }
    }
}
