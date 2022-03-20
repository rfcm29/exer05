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
    
    public void adicionaNavio(Navio navio){
        for(Navio n: navios){
            if(navio.getMatricula().equals(n.getMatricula())){
                System.out.println("Matricula ja existe no porto");
                return;
            }
        }
        navios.add(navio);
        System.out.println("Navio adicionado ao porto");
    }
    
    public int nContentores(){
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
