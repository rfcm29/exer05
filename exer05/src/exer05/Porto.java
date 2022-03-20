/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer05;

import java.util.*;

/**
 *
 * @author rfcm2
 */
public class Porto {
    private ArrayList<Navio> navios;

    public Porto() {
        this.navios = new ArrayList<>();
    }
    
    public String adicionarNavio(String matricula, String nome, float comprimento){
        if(this.navios.isEmpty()){
            Navio navio = new Navio(matricula, nome, comprimento);
            this.navios.add(navio);
            return "Navio adicionado ao porto com sucesso";
        }
        else{
            for(Navio n: navios){
                if(n.getMatricula().equals(matricula))
                    return "Navio já existe";
                else{
                    Navio navio = new Navio(matricula, nome, comprimento);
                    navios.add(navio);
                    return "Navio adicionado ao porto com sucesso";
                }
            }
        }
        return "Erro ao adicionar navio ao porto";
    }
    
    public String adicionarPortaContentores(String matricula, String nome, float comprimento, int numMaxContentores){
        if(this.navios.isEmpty()){
            Navio navio = new PortaContentores(matricula, nome, comprimento, numMaxContentores);
            this.navios.add(navio);
            return "Navio adicionado ao porto com sucesso";
        }
        else{
            for(Navio n: navios){
                if(n.getMatricula().equals(matricula))
                    return "Navio já existe";
                else{
                    Navio navio = new PortaContentores(matricula, nome, comprimento, numMaxContentores);
                    navios.add(navio);
                    return "Navio adicionado ao porto com sucesso";
                }
            }
        }
        return "Erro ao adicionar navio ao porto";
    }
    
    public String adicionarPetroleiro(String matricula, String nome, float comprimento, float capacidade){
        if(this.navios.isEmpty()){
            Navio navio = new Petroleiro(matricula, nome, comprimento, capacidade);
            this.navios.add(navio);
            return "Navio adicionado ao porto com sucesso";
        }
        else{
            for(Navio n: navios){
                if(n.getMatricula().equals(matricula))
                    return "Navio já existe";
                else{
                    Navio navio = new Petroleiro(matricula, nome, comprimento, capacidade);;
                    navios.add(navio);
                    return "Navio adicionado ao porto com sucesso";
                }
            }
        }
        return "Erro ao adicionar navio ao porto";
    }
    
    public int nCOntentores(){
        int nContentores = 0;
        for(Navio n: navios){
            if(n instanceof PortaContentores){
                nContentores += ((PortaContentores) n).getNumMaxContentores();
            }
        }
        return nContentores;
    }
    
    public float capacidadeTotal(){
        float capacidade = 0;
        for(Navio n: navios){
            if(n instanceof PortaContentores){
                capacidade += (((PortaContentores) n).getNumMaxContentores()) * 10000;
            }
        }
        for(Navio n: navios){
            if(n instanceof Petroleiro){
                capacidade += ((Petroleiro) n).getCapacidade();
            }
        }
        
        return capacidade;
    }
}
