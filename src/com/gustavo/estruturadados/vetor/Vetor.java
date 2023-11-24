package com.gustavo.estruturadados.vetor;

public class Vetor {
    private String[] elements;
    private int size;

    public Vetor(int capacity){
        this.elements = new String[capacity];
        this.size = 0;
    }

    /*public void add (String elements){
        for(int i = 0; i < this.elements.length; i++){
            if(this.elements[i] == null){
                this.elements[i] = elements;
                break;
            }
        }
    }*/

    public boolean add(String element) {
        if(this.size < elements.length){
            elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

}
