import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) throws Exception {
        // lendo valores de entrada
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100){
            //atrib aliquota de 5%
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500){
            valorImposto = 0.1F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }
            // TODO criar as demais cond

            // Calcula e imprime a saída com 2 casas dec

            float saida = valorSalario - valorImposto + valorBeneficios;
            System.out.println(String.format("%.2f", saida));
    }
}
