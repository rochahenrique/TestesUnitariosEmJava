package org.example;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        List<String> resultado = verificaFizzBuzz(numero);
        for (String unidade : resultado){
            System.out.println(unidade);
        }

    }

    //A partir do numero inserido verifica se é Fizz, Buzz ou FizzBuzz.
    //Caso o número informado não atenda nenhuma das condições, salva em uma lista como String para posterior comparação em testes unitários
    public static List<String> verificaFizzBuzz(int numero){
        List<String> resultado = new ArrayList<>();
        for(int i = 1; i <= numero; i++){
            if (i % 3 == 0 && i % 5 == 0){
                resultado.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultado.add("Fizz");
            } else if (i % 5 == 0){
                resultado.add("Buzz");
            } else {
                resultado.add(String.valueOf(i));
            }
        }
        return resultado;
    }
}