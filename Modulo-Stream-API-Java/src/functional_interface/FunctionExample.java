package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*Representa uma função que aceita uma rgumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Usar a function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
            .map(n -> n * 2)
            .toList();

        // Imprimir a lista de numeros dobrados
        numerosDobrados.forEach(n -> System.out.println(n));


    }
}
