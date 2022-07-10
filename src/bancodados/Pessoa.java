/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

/**
 *
 * @author KDS
 */
public class Pessoa {
    private Integer number;
    private String nome;
    
   // metodos acessores

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  //

    public Pessoa(Integer number, String nome) {
        this.number = number;
        this.nome = nome;
    }
    
}
