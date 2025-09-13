package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double calculo = 0.0;
        Scanner sc = new Scanner(System.in);

        String[] produtos = {"Pizza", "Hambúrguer", "Salada", "Suco"};
        double[] precos = {30.0, 20.0, 15.0, 8.0};

        String pedidos = "";

        char continuar = 's';
        int opcao;

        while(continuar == 's') {
            System.out.println("=== Cardápio ===");

            for (int i = 0; i < produtos.length; i++) {
                System.out.println((i + 1) + " - " + produtos[i] + " R$" + precos[i]);
            }

            System.out.print("Escolha uma opção (1-4): ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                    calculo += precos[opcao - 1];
                    pedidos += produtos[opcao - 1] + ", ";
                    System.out.println("Você adicionou " + produtos[opcao - 1]);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    continue;
            }

            if (opcao < 1 && opcao > 4) {
                System.out.println("Opção Inválida");
                continue;
            }

            System.out.print("Deseja pedir mais? (s/n): ");
            continuar = Character.toLowerCase((sc.next().charAt(0)));

            while (continuar != 's' && continuar != 'n'){
                System.out.println("Valor inválido, Digite s - para continuar ou n - para sair");
                continuar = Character.toLowerCase((sc.next().charAt(0)));
            }
        }

        System.out.println("\n=== Pedido Final ===");
        System.out.println("Itens: " + pedidos);
        System.out.println("Total: R$ " + calculo);
    }
}