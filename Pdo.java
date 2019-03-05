/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdo;

import java.util.Scanner;


/**
 *
 * @author IreneJose
 */
public class Pdo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca un dia del mes: ");
        Scanner s=new Scanner (System.in);
        int dia= s.nextInt();
        System.out.println("Introduzca un mes del año: ");
         Scanner sc=new Scanner (System.in);
        int mes= sc.nextInt();
         System.out.println("Introduzca un año: ");
         Scanner sr=new Scanner (System.in);
        int año= sr.nextInt();
        
        Fecha f1=new Fecha();
        f1.setDia(dia);
        f1.setMes(mes);
        f1.setAño(año);
        
        
         System.out.println("Introduzca un dia del mes: ");
        Scanner c=new Scanner (System.in);
        int dia2= c.nextInt();
        System.out.println("Introduzca un mes del año: ");
         Scanner cc=new Scanner (System.in);
        int mes2 = cc.nextInt();
         System.out.println("Introduzca un año: ");
         Scanner cr=new Scanner (System.in);
        int año2= cr.nextInt();
        Fecha f2=new Fecha();
         f2.setDia(dia2);
        f2.setMes(mes2);
        f2.setAño(año2);
        
        System.out.println(f1.ajusteRealista(dia,mes,año));  
        System.out.println(f2.ajusteRealista(dia2, mes2, año2));
         //System.out.println(mayorQue(dia, mes, año, dia2, mes2, año2));     
    }
    
}
