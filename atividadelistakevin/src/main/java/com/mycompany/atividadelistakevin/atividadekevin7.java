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
public class atividadekevin7 {

    public static void main(String[] args) {
        String produtoValido = solicitaNomeProduto();

        if (produtoValido != null) {
            System.out.println("Nome valido: " + produtoValido);
        } else {
            System.out.println("Nome invalido. Deve ter pelo menos 10 caracteres.");
        }
    }

    public static String solicitaNomeProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        if (nomeProduto.length() >= 10) {
            return nomeProduto; 
        } else {
            return null; 
        }
    }
}

