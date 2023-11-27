package com.gustavo.estruturadados.vetor;

public class Lista<T> {
    private T[] elements;
    private int size;

    public Lista(int capacity){
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }


    public boolean add(T element) {
        increaseCapacity();
        if(this.size < elements.length){
            elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public void add(int key, T element){
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
            T[] newElements = (T[]) new Object[elements.length * 2];
            for(int i = 0; i < elements.length; i++){
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    public int size(){
        return this.size;
    }

    public Object search(int key){
        if(!(key >= 0 && key < this.size)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return elements[key];
    }

    public int search(T element){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T element){
        return search(element) > -1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.size - 1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }
        if (this.size > 0) {
            s.append(this.elements[this.size - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
