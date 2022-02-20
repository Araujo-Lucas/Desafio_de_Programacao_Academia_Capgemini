package DesafioDeProgramacaoAcademiaCapgemini;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
 @author lucas
*/
public class Questao2 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a sua senha: ");
        String senha = teclado.next();
        
        System.out.println("O número mínimo de caracteres que devem ser adicionados para tornar a senha forte é: " + contarCaracteresNecessarios(senha));
    }
    
    public static int contarCaracteresNecessarios(String senha)
    {
        int count = 0;
        
        Pattern temNumero = Pattern.compile("(\\d)");
        Pattern temMaiuscula = Pattern.compile("([A-Z])");
        Pattern temMinuscula = Pattern.compile("([a-z])");
        Pattern temCaracteresEspeciais = Pattern.compile("(\\W)");
        
        Matcher Digito = temNumero.matcher(senha);
        Matcher Maiuscula = temMaiuscula.matcher(senha);
        Matcher Minuscula = temMinuscula.matcher(senha);
        Matcher CaractereEspecial = temCaracteresEspeciais.matcher(senha);
        
        // Verificando se não existem dígitos 
        if (!Digito.find()) 
        {
            count++;
        }
        // Verificando se não existem letras maiúsculas
        if (!Maiuscula.find())
        {
            count++;
        }
        // Verificando se não existem letras minúsculas
        if (!Minuscula.find()) 
        {
            count++;
        }
        // Verificando se não existem caracteres especiais
        if (!CaractereEspecial.find()) 
        {
            count++;
        }
 
        if ((count + senha.length()) < 6) 
        {
            count = count + 6 - (count + senha.length());
        }
 
        return count;
    }
}
