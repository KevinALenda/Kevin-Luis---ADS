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
public class atividadekevin8 {
    

    public static void main(String[] args) {

        String codigoNCM = solicitaCodigoNCM();
        if (isRelacionadoInformatica(codigoNCM)) {
            System.out.println("O codigo NCM " + codigoNCM + " e relacionado a informatica.");
        } else {
            System.out.println("O codigo NCM " + codigoNCM + " NAO e relacionado a informatica.");
        }
    }

    public static String solicitaCodigoNCM() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o codigo NCM (8 digitos): ");
        return scanner.nextLine();
    }

    public static boolean isRelacionadoInformatica(String codigoNCM) {
        if (codigoNCM.length() != 8 || !codigoNCM.matches("\\d{8}")) {
            System.out.println("Codigo NCM invalido. Codigo deve conter exatamente 8 digitos.");
            return false;
        }

        String[] prefixosInformatica = {"8471", "8517"};

        for (String prefixo : prefixosInformatica) {
            if (codigoNCM.startsWith(prefixo)) {
                return true;
            }
        }
        return false;
    }
}

