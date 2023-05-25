package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Responda 'Sim' ou 'Não' para as seguintes perguntas:");
        System.out.print("Telefonou para a vítima? ");
        String resposta1 = entrada.nextLine();

        System.out.print("Esteve no local do crime? ");
        String resposta2 = entrada.nextLine();

        System.out.print("Mora perto da vítima? ");
        String resposta3 = entrada.nextLine();

        System.out.print("Devia para a vítima? ");
        String resposta4 = entrada.nextLine();

        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = entrada.nextLine();

        int respostaPositiva = 0;

        if (resposta1.equalsIgnoreCase("s")){
            respostaPositiva++;
        }
        if (resposta2.equalsIgnoreCase("s")){
            respostaPositiva++;
        }
        if (resposta3.equalsIgnoreCase("s")){
            respostaPositiva++;
        }
        if (resposta4.equalsIgnoreCase("s")){
            respostaPositiva++;
        }
        if (resposta5.equalsIgnoreCase("s")){
            respostaPositiva++;
        }
        // fecha primeira condição 
        
        if (respostaPositiva == 2) {
            System.out.println("Pessoa suspeita");
        }
        else if (respostaPositiva >= 3 &&  respostaPositiva <= 4) {
            System.out.println("Pessoa cúmplice");
        }
        else if (respostaPositiva == 5) {
            System.out.println("É o assassino! :0");
        }
        else {
            System.out.println("É inocente");
        }
    }
}
