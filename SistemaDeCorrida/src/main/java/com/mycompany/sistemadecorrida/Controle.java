/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadecorrida;

/**
 *
 * @author 202312030003
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {
    
    private List<Passageiro> passageiros;
    private Scanner scanner;
    String origem;
    String destino;

    public Controle() {
        passageiros = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void executarSistema() {
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Passageiro");
            System.out.println("2. Listar Passageiros");
            System.out.println("3. Listar Rotas");
            System.out.println("4. Realizar Corridas");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir \n

            switch (opcao) {
                case 1 -> cadastrarPassageiro();
                case 2 -> listarPassageiros();
                case 3 -> listarRotas();
                case 4 -> realizarCorrida();

                
                case 0 -> {
                    executando = false;
                    System.out.println("Encerrando o sistema...");
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
    Passageiro passageiro;
    private void cadastrarPassageiro() {
        System.out.print("Nome do passageiro: ");
        String nome = scanner.nextLine();

        System.out.print("ID do passageiro (número): ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        passageiro = new Passageiro(nome, id);
        passageiros.add(passageiro);

        System.out.println("Passageiro cadastrado com sucesso!");
    }

    
    private void listarPassageiros() {
        System.out.println("\n--- Passageiros Cadastrados ---");
        for (Passageiro p : passageiros) {
            System.out.println("Nome: " + p.getNome() + " | ID: " + p.getId());
        }
    }
    
    private void listarRotas(){ 
        System.out.println("1. Cohab - Anil");
        System.out.println("2. São Cristóvão - Cidade Operaria");
        System.out.println("3. Ribamar - Raposa");
        System.out.println("4. Maiobão - Forquilha");
        System.out.println("5. João Paulo - São Francisco");
        System.out.println("Insira o numero da rota");
    }
    private void realizarCorrida(){
        
        System.out.println("Insira o numero da rota");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1: 
                origem = "Cohab";
                destino = "Anil";
                break; 
            case 2: 
                origem = "São Cristóvão";
                destino = "Cidade Operaria";
                break; 
            case 3: 
                origem = "Ribamar";
                destino = "Raposa";
                break; 
            case 4: 
                origem = "Maiobão";
                destino = "Forquilha";
                break; 
            case 5: 
                origem = "João Paulo";
                destino = "São Francisco";
                break;
            
            default:
        }
        mostrarInformacoes();
        
    }
    
    private void mostrarInformacoes(){
         System.out.println("Passageiro: " + passageiro.getNome());
         System.out.println("Corrida saindo de: " +  origem);
         System.out.println("Você chegou ao destino: " + destino);
    
    }
}

