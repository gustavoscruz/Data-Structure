package com.gustavo.estruturadados.vetor.teste;

import com.gustavo.estruturadados.vetor.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.add("elemento1");
        vetor.add("elemento2");
        vetor.add("elemento3");

        System.out.println(vetor.size());
        System.out.println(vetor);
    }
}
