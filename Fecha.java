/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdo;

/**
 *
 * @author IreneJose
 */
public class Fecha {
    int dia;
    int mes;
    int año;
 //------------------------------------------------------------------------------Método para ajustar la fecha a parámetros reales----------------------   
public  String ajusteRealista(int dia,int mes,int año){
    
    
    if((año>50)&&(año<100)){
         año=1900+año;
    }
   if((año<50)&&(año>00)){
       año=2000+año;
   }
 //---------------------------------------------------------------------------------------Comprobación número años válido--------------------------------- 
   if(mes<1){
        mes=1;
   } 
   if(mes>12){
       mes=12;
   }
//---------------------------------------------------------------------------------------Comprobación número de mes válido------------------------------  
   if(dia<1){
       dia=1;
   }
   switch (mes){
       case 1: if (dia>31){
           dia=31;
           break;
       }
       case 2: if(dia>28){
           dia=30;
           break;
       }
       case 3: if(dia>31){
           dia=31;
           break;
       }
       case 4: if(dia>30){
          dia=30;
           break;
       }
       case 5: if(dia>31){
           dia=31;
           break;
       }
       case 6: if(dia>30){
           dia=30;
           break;
       }
       case 7: if(dia>31){
           dia=31;
           break;
       }
       case 8: if(dia>31){
           dia=31;
           break;
       }
       case 9: if(dia>30){
           dia=30;
           break;
       }
       case 10: if(dia>31){
           dia=31;
           break;
       }
       case 11: if(dia>30){
           dia=30;
           break;
       }
       case 12: if(dia>31){
           dia=31;
           break;
       }
   }
//---------------------------------------------------------------------------------------------------------Comprobación número de dia válido-------------   
   String fecha=("la fecha realista es: "+dia+"/"+mes+"/"+año);
   return fecha;
}
//-------------------------------------------------------------------------------------Método para saber cuál es el año mayor----------------------------
    public  void mayorQue(int dia,int mes,int año,int dia2,int mes2,int año2){
        String fecha1=(dia+"/"+mes+"/"+año);
        String fecha2=(dia2+"/"+mes2+"/"+año2);
        
        if(año>año2){
            System.out.println("La fecha mayor es: "+fecha1);
        }
        if(año<año2){
            System.out.println("La fecha mayor es: "+fecha2);
        }
        
      
    }
}
