package br.com.tarefa.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class PessoasPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();
        String entrada;

        System.out.println("Digite os nomes no formato Nome-Sexo (M/F)." + "Exemplo: Ana-F,Leo-M,Bia-F" + "\nPara finalizar o cadastro e ver o registro, digite 'continuar':");

        while (true) {
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("continuar")) {
                break;
            }

            String[] entradasDePessoas = entrada.split(",");

            for (String pessoaString : entradasDePessoas) {
                String[] dadosPessoa = pessoaString.split("-");

                if (pessoaString.contains("-")) {
                    String nome = dadosPessoa[0];
                    String sexo = dadosPessoa[1];

                    if (sexo.equalsIgnoreCase("M")) {
                        nomesMasculinos.add(nome);
                    } else if (sexo.equalsIgnoreCase("F")) {
                        nomesFemininos.add(nome);
                    }
                } 
            }

            System.out.println("Nomes adicionados! Digite mais nomes ou 'continuar' para finalizar o cadastro.");
        }

        Collections.sort(nomesMasculinos);
        Collections.sort(nomesFemininos);

        System.out.println("\n--- Grupo Masculino ---");
        System.out.println(nomesMasculinos);

        System.out.println("\n--- Grupo Feminino ---");
        System.out.println(nomesFemininos);
    }
}