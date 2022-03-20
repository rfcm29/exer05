/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer05;

import java.util.*;

/**
 * Class Porto que vai armazenar todas as informações relativa aos navios
 * @author rfcm2
 */
public class Porto {
    private ArrayList<Navio> navios;

    /**
     * Construtor que inicializada todas as variaveis pretencentes à class Porto
     */
    public Porto() {
        this.navios = new ArrayList<>();
    }
    
    /**
     * metodo que armazena um novo navio no Porto se a matricula deste for unica
     * @param navio
     */
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
    
    /**
     * metodo que retorna a soma de todos os contentores existentes em todos os navios do Porto
     * @return
     */
    public int nContentores(){
        int nContentores = 0;
        for(Navio n: navios){
            if(n instanceof PortaContentores){
                nContentores += ((PortaContentores) n).getNumMaxContentores();
            }
        }
        return nContentores;
    }
    
    /**
     * metodo responsavel por retornar a capacidade total dos navios em litros
     * @return
     */
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
