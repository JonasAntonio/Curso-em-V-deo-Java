/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distanciaentredoispontos;
import java.util.Scanner;

/**
 *
 * @author jonas
 */
public class DistanciaEntreDoisPontos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        System.out.println("Valor xa");
        float xa = ent.nextFloat();
        System.out.println("Valor xb");
        float xb = ent.nextFloat();
        System.out.println("Valor ya");
        float ya = ent.nextFloat();
        System.out.println("Valor yb");
        float yb = ent.nextFloat();
        float distancia;
        distancia = (float) Math.sqrt(Math.pow(xb-xa,2) + Math.pow(yb-ya,2));
        System.out.printf("Distancia: %.2f \n", distancia);
        
    }
    
}
