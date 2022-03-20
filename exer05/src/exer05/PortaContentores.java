/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer05;

/**
 *
 * @author fraba
 */
public class PortaContentores extends Navio{
    private int numMaxContentores;
    
    public PortaContentores(String matricula, String nome, float comprimento, int numMaxContentores) {
        super(matricula, nome, comprimento);
        this.numMaxContentores = numMaxContentores;
    }

    public int getNumMaxContentores() {
        return numMaxContentores;
    }

    public void setNumMaxContentores(int numMaxContentores) {
        this.numMaxContentores = numMaxContentores;
    }
    
}
