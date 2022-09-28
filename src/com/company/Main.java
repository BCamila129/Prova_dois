package com.company;

import java.util.Scanner;

import static com.company.Cliente.cpf;
import static com.company.Cliente.nome;

public class Main {

    public static void main(String[] args) {
        int opcaoEscolhida;
        Scanner scanner = new Scanner(System.in);
        Scanner opcao = new Scanner(System.in);
        opcaoEscolhida = opcao.nextInt();

        System.out.println("Para encerrar sessão digite 0");
        System.out.println("Para adicionar um cliente a lista, digite 1");
        System.out.println("Para mostrar lista de clientes, digite 2");
        System.out.println("Para remover um produto do cliente da lista, digite 3");
        System.out.println("Para adicionar produto, digite 4");


        if (opcaoEscolhida == 0) {
            System.out.println("Sessão Encerrada!");
        }
        if (opcaoEscolhida == 1) {
            Scanner achar = new Scanner(System.in);
            System.out.println("Digite nome do cliente: ");
            Cliente.nome = achar.nextLine();
            System.out.println("Digite cpf do cliente: ");
            cpf = achar.nextInt();
        }
//        if(opcaoEscolhida == 2){
//            for(int i = 0; i < listCliente(nome); i++) {
//                System.out.println();
//            }
//        }

        if (opcaoEscolhida == 4) {
            System.out.println("Digite o id do produto: ");
            Produtos.id = scanner.nextInt();
            System.out.println("Digite a quantidade desejada do item: ");
            Produtos.quantidade = scanner.nextInt();
            System.out.println("Digite o nome do item: ");
            Produtos.Nome = scanner.nextLine();
            System.out.println("Digite o preço do item: ");
            Produtos.precoIndividual = scanner.nextDouble();

        }

    }
}





