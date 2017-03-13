
package br.com.satc.atividades1;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Atividade1 {
    

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float media ;   
        System.out.println("Digite sua primeira nota: ");
        float nota1 = entrada.nextFloat(); 
        
        System.out.println("Digite sua segunda nota: ");
        float nota2 = entrada.nextFloat();
        
        System.out.println("Digite sua terceira nota: ");
        float nota3 = entrada.nextFloat();
        
        media = (nota1+nota2+nota3)/3;
         
        System.out.println("Qual é a nota minima? ");
        float notamin = entrada.nextFloat () ;
        
        if ( notamin <= media ) {
            System.out.println("Você foi APROVADO!");
        } else {
            System.out.println("Você foi REPROVADO!");
        }
        
        
        
        
        
       
               

             
                
    }
    
}
