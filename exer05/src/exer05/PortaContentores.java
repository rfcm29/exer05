/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer05;

/**
 * Classe PortaContentores que define quais as características deste tipo de navio
 * @author fraba
 */
public class PortaContentores extends Navio{
    private int numMaxContentores;
    
    /**
     * Construtor da Classe PortaContentores que recebe as informações necessárias para criar um navio deste tipo,
            sendo o número máximo de contentores uma característica específica deste navio

     * @param matricula
     * @param nome
     * @param comprimento
     * @param numMaxContentores
     */
    public PortaContentores(String matricula, String nome, float comprimento, int numMaxContentores) {
        super(matricula, nome, comprimento);
        this.numMaxContentores = numMaxContentores;
    }

    /**
     * método que retorna o número máximo de contentores
     * @return
     */
    public int getNumMaxContentores() {
        return numMaxContentores;
    }

    /**
     * método que define o número máximo de contentores
     * @param numMaxContentores
     */
    public void setNumMaxContentores(int numMaxContentores) {
        this.numMaxContentores = numMaxContentores;
    }
    
}
