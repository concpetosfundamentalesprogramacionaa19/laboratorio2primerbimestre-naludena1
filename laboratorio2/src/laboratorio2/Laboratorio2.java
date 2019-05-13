/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.Scanner;

/**
 *
 * @author nali1
 */
public class Laboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  entrada = new Scanner (System.in);
        
        // Variables
        String nombre;
        String apellido;
        String mensajeFinal ="";
        String resultFinal = "";
        int salida;
        int i;
        int hijos;
        int cont = 1;
        double sueldo;
        double pasaje;
        double bar;
        double salidas;
        double totalPasaje = 0;
        double totalBar = 0;
        double totalSalidas = 0;
        double alcanza_falta;
        double sumaTotal = 0;
        boolean bandera = true;
       
        
        do {
            mensajeFinal = "";   
             mensajeFinal = String.format("%s\n\nReporte de Gastos\n", // Almacen de datos en la variable mensajeFinal
                     mensajeFinal, cont);
             mensajeFinal = String.format("%sPersonas\t\tPasaje\t\t\tBar\t\t\t"
                     + "Salidas\n", mensajeFinal);
            
            // Entrada de datos
            System.out.println("Ingrese su nombre");
            nombre = entrada.next();
     
            System.out.println("Ingrese su apellido");
            apellido = entrada.next();
             
            System.out.println("Ingrese su sueldo semanal");
            sueldo = entrada.nextDouble();
             
            System.out.println("¿Cuántos hijos tiene?");
            hijos = entrada.nextInt();
            
            // Ingreso datos del hijo
            for (i=1; i<= hijos; i++){
            System.out.printf("Ingrese el costo semanal del gasto de pasaje "
                    + "de su hijo #%d\n", i);
            pasaje = entrada.nextDouble();
            
            System.out.printf("Ingrese el costo semanal del gasto del bar "
                    + "de su hijo #%d\n", i);
            bar = entrada.nextDouble();
            
            System.out.printf("Ingrese el costo semanal del gasto de salidas "
                    + "de su hijo #%d\n", i);
            
    
            salidas = entrada.nextDouble();
            // Cálculo de totales
            totalPasaje = totalPasaje + pasaje;
            totalBar = totalBar + bar;
            totalSalidas = totalSalidas + salidas;
            sumaTotal = totalPasaje + totalBar + totalSalidas;

            // Almacen de datos del hijo
            mensajeFinal = String.format ("%sHijo%d\t\t\t%.2f\t\t\t%.2f\t\t\t"
                    + "%.2f\n",mensajeFinal,i , pasaje, bar, salidas);
                            
            }
            mensajeFinal = String.format ("%sTotales\t\t\t%.2f\t\t\t%.2f\t\t\t"
                    + "%.2f\n", mensajeFinal, totalPasaje, totalBar, 
                    totalSalidas);
      
            
            // Generar el reporte final
            resultFinal = String.format("%s Reporte Gastos de Padres de Familia"
                    + "\n\nReporte 00%d\n\nNombre del padre de familia: %s %s\n"
                     + "Sueldo semanal: %.2f\nNúmero de hijos: %d\n%s"
                    ,resultFinal, cont, nombre, apellido, sueldo, hijos,
                    mensajeFinal);
            cont = cont + 1; // Para que el contador se incremente
            
  
             if (sumaTotal <= sueldo ) {   // Cálculo si le alcanza o le falta al padre
                    resultFinal = String.format ("%sEl padre de familia %s %s"
                            + " le alcanza el dinero semanal, para sus gastos\n"
                            ,resultFinal, nombre, apellido);
                }else{
                resultFinal = String.format ("%sEl padre de familia %s %s " // Caso contrario
                        + "le falta el dinero semanal, para sus gastos\n"
                        ,resultFinal, nombre, apellido);
            }
             // Pregunta si desea continuar
            System.out.println("¿Desea continuar? Digite \n1. para continuar, "
                    + "\n2. para salir");
            salida = entrada.nextInt();
            
            // Cálculo de bandera
            if (salida ==1){
                bandera = true;s
            }else{
                bandera = false;
            }
        
            
        } while (bandera == true);
        System.out.printf("%s", resultFinal); // Salida de datos
        System.out.printf("Fin del reporte 00%d", cont); // Salida de datos
}
        
    }
      
        
       
    
        
