package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Crear objeto (forma normal)
        // Calculadora service = new Calculadora();

        //Recibir un objeto de beans
        com.example.Calculadora calculadora = (com.example.Calculadora) context.getBean("calculadora");

        String texto = calculadora.holaMundo();
        System.out.println(texto);

        // Se puede volver a obtener pero se recupera el mismo objeto
        com.example.Calculadora calculadora2 = (com.example.Calculadora) context.getBean("calculadora");
        texto = calculadora.holaMundo();
        System.out.println(texto);

        //Ejemplo 2 Cargar un beans dentro de otro Beans
        com.example.GestorFacturas gestor = (com.example.GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());

        // CONCEPTO 3: scope o alcance
        // los beans por defecto son singleton, se crea el objeto y se reutiliza para toda la aplicación
        // podemos cambiarlo a scope="prototype" si queremos que se cree un nuevo objeto cada vez
        // verificarlo viendo cómo se ejecuta varias veces un constructor
    }


}