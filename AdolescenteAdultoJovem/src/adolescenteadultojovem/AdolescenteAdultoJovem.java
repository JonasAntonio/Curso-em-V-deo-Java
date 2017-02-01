/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adolescenteadultojovem;
import java.util.Scanner;

/**
 *
 * @author jonas
 */
public class AdolescenteAdultoJovem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = ent.nextInt();
        if(idade >= 5 && idade<=7){
            System.out.println("Infantil");
        }else if(idade >= 8 && idade <= 10){
            System.out.println("Juvenil");
        }else if(idade >= 11 && idade <= 15){
            System.out.println("Adolescente");
        }else if(idade >=16 && idade<= 30){
            System.out.println("Adulto");
        }else if(idade > 30){
            System.out.println("Senior");
        }else{
            System.out.println("Valor Inválido");
        }
    }
    
}
