/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer05;

import java.util.Scanner;

/**
 *
 * @author rfcm2
 */
public class Exer05 {
    private static Porto porto;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CriarPorto();
        Menu();
    }

    private static void CriarPorto() {
        porto = new Porto();
    }

    private static void Menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("MENU");
            System.out.println("1 - Criar navio");
            System.out.println("2 - Numero de contentores no porto");
            System.out.println("3 - Capacidade maxima");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
        
            switch(opcao){
                case 0: 
                    break;
                case 1: criarNavio();
                    break;
                case 2: System.out.println("Numero de contentores presentes no porto: " + porto.nContentores());
                    break;
                case 3: System.out.println("Capacidade total em litros dos navios no porto" + porto.capacidadeTotal());
                    break;
                default: System.out.println("Menu inválido");
                    break;
            }
        }while(opcao != 0);
    }

    private static void criarNavio() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("MENU");
            System.out.println("1 - Criar Porta Contentores");
            System.out.println("2 - Criar Petroleiro");
            System.out.println("3 - Cancelar");
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 0: 
                    break;
                case 1: criarPetroleiro();
                    break;
                case 2: criarPortaContentores();
                    break;
                case 3: System.out.println("Capacidade total em litros dos navios no porto" + porto.capacidadeTotal());
                    break;
                default: System.out.println("Menu inválido");
                    break;
            }
        }while(opcao != 0);
    }

    private static void criarPetroleiro() {
       
    }

    private static void criarPortaContentores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
