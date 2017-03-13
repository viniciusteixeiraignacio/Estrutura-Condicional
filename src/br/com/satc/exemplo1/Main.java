package br.com.satc.exemplo1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Main {

    public static void main(String[] args) {
        //IF
        //switch case
        System.out.println("Qual a sua idade? ");
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();
        if (idade < 13){
            System.out.println("Criança");
        }else if ((idade > 13) && (idade <=17)) {
            System.out.println("Adolescente");
        } else if ((idade >= 18) && (idade <= 26)) {
            System.out.println("Jovem Adulto");
        } else if ((idade > 26) && (idade < 65)) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }

}
