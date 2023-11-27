package com.gustavo.estruturadados.vetor.teste;

import com.gustavo.estruturadados.vetor.Lista;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println(stack.peek());
    }
}
