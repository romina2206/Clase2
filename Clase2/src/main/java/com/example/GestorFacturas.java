package com.example;

public class GestorFacturas {

    //atributos
    com.example.Calculadora calculadora;
    String nombre;

    //constructores
    public GestorFacturas(com.example.Calculadora calculadora, String nombre) {
        System.out.println("Ejecutando constructor GestorFacturas ");
        this.calculadora = calculadora;
        this.nombre = nombre;

    }

    //metodos
}
