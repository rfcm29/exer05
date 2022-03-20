/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer05;

/**
 *
 * @author fraba
 */
public class Petroleiro extends Navio{

private float capacidade;
    
    public Petroleiro(String matricula, String nome, float comprimento, float capacidade) {
        super(matricula, nome, comprimento);
        this.capacidade = capacidade;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }


    
}
