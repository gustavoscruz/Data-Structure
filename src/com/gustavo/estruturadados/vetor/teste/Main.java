package com.gustavo.estruturadados.vetor.teste;

import com.gustavo.estruturadados.vetor.Vetor;
import com.gustavo.estruturadados.vetor.VetorObject;

public class Main {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(3);

        vetor.add(3);
        vetor.add(4);

        System.out.println(vetor);

    }
}
