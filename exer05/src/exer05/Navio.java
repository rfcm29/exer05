/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer05;

/**
 * Classe Navio que define as características gerais de um navio
 * @author fraba
 */
public class Navio {
    private String matricula;
    private String nome;
    private float comprimento;

    /**
     * Construtor que recebe as informações necessárias para a criação de um navio
     * @param matricula
     * @param nome
     * @param comprimento
     */
    public Navio(String matricula, String nome, float comprimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.comprimento = comprimento;
    }

    /**
     * Método que retorna a matrícula.
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Método que retorna o nome
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que retorna o comprimento do navio
     * @return
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * Método que define o nome do navio
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que define o comprimento do navio
     * @param comprimento
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

}
