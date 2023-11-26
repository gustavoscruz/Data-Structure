package com.gustavo.estruturadados.vetor;

import java.util.Arrays;

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
        increaseCapacity();
        if(this.size < elements.length){
            elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public void add(int key, String element){
        if(!(key >= 0 && key < this.size)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        increaseCapacity();

        for(int i = size - 1; i >= key; i--){
            elements[i+1] = elements[i];
        }

        elements[key] = element;
        size++;
    }

    public void remove(int key){
        if(!(key >= 0 && key < this.size)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for(int i = key; i < elements.length -1; i++){
            elements[i] = elements[i + 1];
        }
        size--;
    }

    private void increaseCapacity(){
        if(size == elements.length){
            String[] newElements = new String[elements.length * 2];
            for(int i = 0; i < elements.length; i++){
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    public int size(){
        return this.size;
    }

    public String search(int key){
        if(!(key >= 0 && key < this.size)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return elements[key];
    }

    public int search(String element){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.size - 1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }
        if(this.size > 0){
            s.append(this.elements[this.size - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
