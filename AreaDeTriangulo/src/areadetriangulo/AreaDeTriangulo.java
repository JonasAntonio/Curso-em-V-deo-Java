/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadetriangulo;
import java.util.Scanner;
/**
 *
 * @author jonas
 */
public class AreaDeTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        System.out.println("Valor da Base: ");
        int b = ent.nextInt();
        System.out.println("Valor da Altura: ");
        int h = ent.nextInt();
        float area = b*h/2;
        System.out.println("A área do triângulo é " + area);
        
    }
    
}
