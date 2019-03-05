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
    private int dia;
    private int mes;
    private int año;
    
    public int getDia(){
        return this.dia;
    }
   public void setDia(Fecha dia) {
        this.dia = dia;
    }
    public int getMes(){
      return this.mes;
    }
    public void setMes(Fecha mes) {
        this.mes = mes;
    }
    public int getAño(){
        return this.año;
    }
   public void setAño(Fecha año) {
        this.año = año;
    }
    
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
        String fecha1=(f1.getDia+"/"+f1.getMes+"/"+f1.getAño);
        String fecha2=(f2.getDia+"/"+f2.getMes+"/"+f2.getAño2);
        
        if(f1.getAño>f2.getAño){
            System.out.println("La fecha mayor es: "+fecha1);
        }
        if(f1.Año<f2.Año2){
            System.out.println("La fecha mayor es: "+fecha2);
        }
        if(f1.getAño==f2.getAño){
            if(f1.getMes>f2.getMes){
                System.out.println("La fecha mayor es: "+fecha1);
            }
            if(f1.getMes<f2.getMes){
                System.out.println("La fecha mayor es: "+fecha2);
            }
            if(f1.getMes==f2.getMes){
                if(f1.getDia>f2.getDia){
                      System.out.println("La fecha mayor es: "+fecha1);
                }
                if(f1.getDia<f2.getDia){
                      System.out.println("La fecha mayor es: "+fecha2);
                }
                if(f1.getDia==f2.getDia){
                    System.out.println("Las dos fechas son iguales");
                }
            }
        }
      
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------