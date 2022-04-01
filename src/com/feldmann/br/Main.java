package com.feldmann.br;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //
        String codigo = "";
        System.out.println("ola mundo");
        Scanner ler = new Scanner(System.in);
        //
        Map<Character, String> lista = new HashMap<Character, String>();

        //espaço
        lista.put(' ', "  ");
        //letras minusculas
        lista.put('a', " .- ");
        lista.put('b', " -... ");
        lista.put('c', " -.-. ");
        lista.put('d', " .- ");
        lista.put('e', " . ");
        lista.put('f', " ..-. ");
        lista.put('g', " --. ");
        lista.put('h', " .... ");
        lista.put('i', " .. ");
        lista.put('j', " .--- ");
        lista.put('k', " -.- ");
        lista.put('l', " .-.. ");
        lista.put('m', " -- ");
        lista.put('n', " -. ");
        lista.put('o', " --- ");
        lista.put('p', " .--. ");
        lista.put('q', " --.- ");
        lista.put('r', " .-. ");
        lista.put('s', " ... ");
        lista.put('t', " - ");
        lista.put('u', " ..- ");
        lista.put('v', " ...- ");
        lista.put('w', " .-- ");
        lista.put('x', " -..- ");
        lista.put('y', " -.-- ");
        lista.put('z', " --.. ");
        //letras maiusculas
        lista.put('A', " .- ");
        lista.put('B', " -... ");
        lista.put('C', " -.-. ");
        lista.put('D', " .- ");
        lista.put('E', " . ");
        lista.put('F', " ..-. ");
        lista.put('G', " --. ");
        lista.put('H', " .... ");
        lista.put('I', " .. ");
        lista.put('J', " .--- ");
        lista.put('K', " -.- ");
        lista.put('L', " .-.. ");
        lista.put('M', " -- ");
        lista.put('N', " -. ");
        lista.put('O', " --- ");
        lista.put('P', " .--. ");
        lista.put('Q', " --.- ");
        lista.put('R', " .-. ");
        lista.put('S', " ... ");
        lista.put('T', " - ");
        lista.put('U', " ..- ");
        lista.put('V', " ...- ");
        lista.put('W', " .-- ");
        lista.put('X', " -..- ");
        lista.put('Y', " -.-- ");
        lista.put('Z', " --.. ");
        //numeros
        lista.put('1', " .---- ");
        lista.put('2', " ..--- ");
        lista.put('3', " ...-- ");
        lista.put('4', " ....- ");
        lista.put('5', " ..... ");
        lista.put('6', " -.... ");
        lista.put('7', " --... ");
        lista.put('8', " ---.. ");
        lista.put('9', " ----. ");
        lista.put('0', " ----- ");

        System.out.println("Digite uma palavra: ");
        String myString = ler.nextLine();
        char[] myChars = myString.toCharArray();
        for (int i=0; i<myChars.length; i++){

            codigo = codigo + lista.get(myChars[i]);

        }//for
        System.out.println("codigo traduzido: \n" + codigo);

    }//main
}//class
