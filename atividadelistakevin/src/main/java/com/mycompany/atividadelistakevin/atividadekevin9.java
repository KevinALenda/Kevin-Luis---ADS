/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadelistakevin;
import java.util.Scanner;
/**
 *
 * @author kkevi
 */
public class atividadekevin9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o ano de nascimento: ");
        int ano = scanner.nextInt();

        String resultado = processarNomeAno(nome, ano);
        System.out.println("Nome processado: " + resultado);
    }
    public static String processarNomeAno(String nome, int ano) {
        if (isNumeroPrimo(ano)) {
            nome = nome.replace('A', '@').replace('a', '@');
            nome = nome.replace('E', '!').replace('e', '!');
        } else {
            nome = nome.replace('E', '#').replace('e', '#');
            nome = nome.replace('O', '*').replace('o', '*');
        }

        return nome;
    }
    public static boolean isNumeroPrimo(int numero) {
        if (numero <= 1) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

