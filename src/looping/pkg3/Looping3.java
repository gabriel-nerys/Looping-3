/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping.pkg3;

/**
 *
 * @author Luciana
 */
import java.util.Scanner;

public class Looping3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada;
        double a, n1, i;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Dígite o grau c°: ");
        n1 = entrada.nextDouble();
        i = 1;
        
        while(i < 15)
        {
            a = Math.pow(n1,i);
            System.out.println(a);
            i++;
        }
    }
    
}
