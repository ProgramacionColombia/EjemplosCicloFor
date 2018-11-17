/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplociclofor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ProgramacionColombia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ejecutarForInfinito(array);

    }

    public static void mostrarElementosForBasico(int[] array) {

        System.out.println("Inicio");
        System.out.print("Array con el foreach ------> ");
        for (int elemento : array) {
            System.out.print(elemento + " - ");
        }

        System.out.print("\nArray con el for estandar -> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");

        }

        //se convierte un array a lista usando Java 8
        List<Integer> lista = Arrays.stream(array).boxed().collect(Collectors.toList());

        System.out.print("\nLista con el foreach ------> ");
        for (int elementoLista : lista) {
            System.out.print(elementoLista + " - ");
        }

        System.out.print("\nLista con el for estandar -> ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " - ");
        }

        System.out.println("\nFin");

    }

    //Se crea un for con 2 variables en el bloque de inicializacion y actualizacion
    public static void ejecutarForConMultiplesVariables(int[] array) {
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            System.out.print(array[i] + " - ");

        }
    }

    //Se crea un for infinito, donde no existe el bloque de inicializacion, ni el  
    //de condicion, ni el de actualizacion
    public static void ejecutarForInfinito(int[] array) {
        int j = 0;
        for (;;) {
            if (j == array.length) {
                break;
            }
            System.out.print(array[j] + " - ");
            j++;
        }
    }

    //Se crea un for sin el bloque de condicion para terminar el ciclo
    public static void ejecutarForSinCondicion(int[] array) {
        for (int j = 0;; j++) {
            if (j == array.length) {
                break;
            }
            System.out.print(array[j] + " - ");
        }
    }

    //Se crea un for sin bloque de actualizacion
    public static void ejecutarForSinSenteciaDeActualizacion(int[] array) {
        for (int j = 0; j < array.length;) {
            System.out.print(array[j] + " - ");
            j++;
        }
    }

    //Se crea un for solo con la condicion para terminar el ciclo
    public static void ejecutarForSoloConCondicion(int[] array) {
        int i = 0;
        for (; i < array.length;) {
            System.out.print(array[i] + " - ");
            i++;
        }

    }

    //Se crea un for sin inicializacion de variables
    public static void ejecutarForSinInicializacionDeVariable(int[] array) {
        int i = 0;
        for (; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
    }

}
