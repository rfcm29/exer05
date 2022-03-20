/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer05;

/**
 * Classe Petroleiro que define quais as características deste tipo de navio
 * @author fraba
 */
public class Petroleiro extends Navio{

private float capacidade;
    
    /**
     * Construtor da Classe Petroleiro que recebe as informações necessárias para a criação deste tipo de navio,
            sendo a capacidade uma característica específica deste navio
     * @param matricula
     * @param nome
     * @param comprimento
     * @param capacidade
     */
    public Petroleiro(String matricula, String nome, float comprimento, float capacidade) {
        super(matricula, nome, comprimento);
        this.capacidade = capacidade;
    }

    /**
     * Método que retorna a capacidade máxima do navio
     * @return
     */
    public float getCapacidade() {
        return capacidade;
    }

    /**
     * Método que define a capacidade máxima do navio
     * @param capacidade
     */
    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }


    
}
