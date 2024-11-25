/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadelistakevin;

    import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author kkevi
 */
public class atividadekevin10 {


    public static void main(String[] args) {
        String[][] alunos = {
            {"Kevin", "44223"},
            {"Lidia", "11003"},
            {"Caio", "33003"},
            {"Eduard", "77110"},
            {"Carmen", "99442"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto para buscar no nome dos alunos: ");
        String textoBusca = scanner.nextLine();

        String[][] alunosEncontrados = busca_aluno(alunos, textoBusca);

        System.out.println("\nAlunos encontrados:");
        imprime_matriz(alunosEncontrados);
    }

    public static String[][] busca_aluno(String[][] alunos, String textoBusca) {
        ArrayList<String[]> alunosFiltrados = new ArrayList<>();

        for (int i = 0; i < alunos.length; i++) {
            String nomeAluno = alunos[i][0].toLowerCase(); 
            if (nomeAluno.contains(textoBusca.toLowerCase())) {
                alunosFiltrados.add(alunos[i]);
            }
        }

        String[][] resultado = new String[alunosFiltrados.size()][2];
        return alunosFiltrados.toArray(resultado);
    }
    public static void imprime_matriz(String[][] alunos) {
        if (alunos.length == 0) {
            System.out.println("Nenhum aluno encontrado.");
            return;
        }
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Nome: " + alunos[i][0] + " | RA: " + alunos[i][1]);
        }
    }
}

