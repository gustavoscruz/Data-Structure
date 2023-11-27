package com.gustavo.estruturadados.vetor.teste;

import com.gustavo.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);
        lista.add("A");
        lista.add("B");
        lista.add("C");

        System.out.println(lista.contains("A"));
        System.out.println(lista.contains("B"));
        System.out.println(lista.contains("E"));;

    }
}
