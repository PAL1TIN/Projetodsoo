/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadecorrida;

/**
 *
 * @author Khauan
 */
public abstract class Usuario {
    protected String nome;
    protected int id;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
    
    public abstract void mostrarInformacoes();
    
    
}
