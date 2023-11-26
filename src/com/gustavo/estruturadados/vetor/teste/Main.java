package com.gustavo.estruturadados.vetor.teste;

import com.gustavo.estruturadados.vetor.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.add("a");
        vetor.add("b");
        vetor.add("c");
        vetor.add("d");

        System.out.println(vetor);

        vetor.add(1,"g");

        System.out.println(vetor);
    }
}
