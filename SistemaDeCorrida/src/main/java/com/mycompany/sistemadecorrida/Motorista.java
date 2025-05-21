/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadecorrida;

/**
 *
 * @author Khauan
 */
public class Motorista extends Usuario {

    public Motorista(String nome, int id) {
        super(nome, id);
    }
    

    
    
    
    
    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + " ID: " + id);

    }
    
    
    
    

}
