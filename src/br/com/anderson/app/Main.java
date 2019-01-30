package br.com.anderson.app;

import static java.lang.Math.PI;

/**
 *
 * @author Anderson Silva
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // Comprimento de uma circunferência 2 x r x PI (3,1415)
        int raio = 7;
        double comprimento = 2 * raio * PI;
        
        System.out.println("Comprimento: " + comprimento);

        // Máximo e minimo
        double[] precos = {60.30, 15.55};       
        
        System.out.println("Maior preço: " + Math.max(precos[0], precos[1]));        
        System.out.println("Menor preço: " + Math.min(precos[0], precos[1]));

        // Potência
        System.out.println("5^7: " + Math.pow(5, 7));

        // Raiz quadrada
        System.out.println("Raiz de 9: " + Math.sqrt(9));

        // Arredondamento ceil, floor e round
        double n = 5.4;
        
        System.out.println("Menor inteiro: " + Math.floor(n));
        System.out.println("Maior inteiro: " + Math.ceil(n));
        System.out.println("Arredondando: " + Math.round(n));

        // Trigonometria
        System.out.println("Seno: " + Math.sin(70));

        // Números randomicos
        int aleatorio = (int)(Math.random() * 9999);
        
        System.out.println("Números Aleatórios: " + aleatorio);
    }
}
