package com.gustavo.estruturadados.vetor.teste;

import com.gustavo.estruturadados.vetor.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        vetor.add("a");
        vetor.add("b");
        vetor.add("c");
        vetor.add("d");

        System.out.println(vetor);

        vetor.remove(2);

        System.out.println(vetor);

    }
}
