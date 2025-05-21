/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadecorrida;

/**
 *
 * @author Khauan
 */
public class Passageiro extends Usuario{

    public Passageiro(String nome, int id) {
        super(nome, id);
    }
    
    @Override
    public void mostrarInformacoes() {
        System.out.println("Passageiro: " + nome + " ID: " + id);
    }

 
    
    
}
