package Exercicio1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#,##0.00");
        DecimalFormat formatadorPorcent = new DecimalFormat("0");

        System.out.println("Digite o valor da hora trabalhada no mês: ");
        double valorHora = entradaDoUsuario.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês: ");
        double horaTrabalhada = entradaDoUsuario.nextDouble();

        double salarioBruto = valorHora * horaTrabalhada;

        System.out.println("Seu salário mensal (bruto) é de: R$ " + formatador.format(salarioBruto));


        double descontoIr = 0;


        if (salarioBruto >= 900 && salarioBruto < 1500) {
            descontoIr = salarioBruto * 0.05;
            double porcentagemIR = 5;
            System.out.println("(-)  IR (" + formatadorPorcent.format(porcentagemIR) + "%)"
                    + "                        :"
                    + " R$ " + formatador.format(descontoIr));
        } else if (salarioBruto >= 1500 && salarioBruto < 2500) {
            descontoIr = salarioBruto * 0.10;

            double porcentagemIR = 10;
            System.out.println("(-)  IR (" + formatadorPorcent.format(porcentagemIR) + "%)"
                    + "                        :"
                    + " R$ " + formatador.format(descontoIr));
        } else if (salarioBruto >= 2500) {
            descontoIr = salarioBruto * 0.2;
            double porcentagemIR = 20;
            System.out.println("(-)  IR (" + formatadorPorcent.format(porcentagemIR) + "%)"
                    + "                        :"
                    + " R$ " + formatador.format(descontoIr));

        } else {
            System.out.println("Sem desconto de IR" + formatador.format(descontoIr));
        }

        double descontoInss = (salarioBruto * 0.10);
        System.out.println("(-)  INSS (10%)" + "                     :"
                + " R$ " + formatador.format(descontoInss));

        double fgts = (salarioBruto * 11) / 100;
        System.out.println("FGTS (11%)" + "                          :"
                + " R$ " + formatador.format(fgts));

        double totalDeDescontos = descontoInss + descontoIr;
        System.out.println("Total de descontos" + "                  :"                 + " R$ "
                + formatador.format(totalDeDescontos));

        double salarioLiquido = salarioBruto - descontoInss - descontoIr;
        System.out.println("Salário Liquido" + "                     :"                 + " R$ "
                + formatador.format(salarioLiquido));
    }
}
