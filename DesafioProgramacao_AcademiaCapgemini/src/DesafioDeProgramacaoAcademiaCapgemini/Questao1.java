package DesafioDeProgramacaoAcademiaCapgemini;

import java.util.Scanner;

/*
 @author lucas
*/
public class Questao1 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da escada: ");
        int n = teclado.nextInt();
        
        for(int i=1; i<=n; i++)
	{
            for(int j=n-i; j>=1; j--)
            {
                System.out.printf(" ");
            }
		
            for(int j=1; j<=i; j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
	}
    }
}
