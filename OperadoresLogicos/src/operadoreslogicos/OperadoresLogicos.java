/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author james
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y && y<z) ? true : false;
        System.out.println(r);
        boolean r1;
        r1 = (x<y && y==z) ? true : false;
        System.out.println(r1);
        boolean r2;
        r2 = (x<y || y==z) ? true : false;
        System.out.println(r2);
        boolean r3;
        r3 = (x<y ^ y==z) ? true : false;
        System.out.println(r3);
    }
    
}
