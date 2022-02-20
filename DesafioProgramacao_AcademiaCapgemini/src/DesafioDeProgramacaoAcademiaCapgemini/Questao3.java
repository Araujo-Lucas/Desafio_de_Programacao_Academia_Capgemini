package DesafioDeProgramacaoAcademiaCapgemini;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
/*
  @author lucas
*/
public class Questao3 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma string qualquer: ");
        String exemploString = teclado.next();
        
        System.out.println("Número de pares de substrings que são anagramas: " + subString(exemploString));
    }
    
    static int subString(String exemploString)
    {
        HashMap<String, Integer> map= new HashMap<>();
  
        for(int i = 0; i < exemploString.length(); i++)
        {
            for(int j = i; j < exemploString.length(); j++)
            {
                char[] valorCaractere = exemploString.substring(i, j+1).toCharArray();
                Arrays.sort(valorCaractere);
                String valor = new String(valorCaractere);
                
                if (map.containsKey(valor))
                {
                    map.put(valor, map.get(valor)+1);
                }
                else
                {
                    map.put(valor, 1);
                }    
            }
        }
        int paresDeAnagramas = 0;
        
        for(String key: map.keySet())
        {
            int n = map.get(key);
            paresDeAnagramas += (n * (n-1))/2;
        }
        
        return paresDeAnagramas;
    }
}
