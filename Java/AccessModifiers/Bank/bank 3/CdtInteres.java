/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Estudiantes
 */
public class CdtInteres {
 
    private double cdtInteres;
    private int meses;
    private double montoCdt;
    private double valorCdt; 
    
    public double  setinteresCdt(){
        this.valorCdt = this.montoCdt*cdtInteres;
        return valorCdt;
    }
    
    public void getvalorCdt(int montoCdt){
        System.out.println("El saldo del cdt a seis meses con interes de " + this.cdtInteres +  " es de " + this.valorCdt);
     
    }
    
    public CdtInteres (double cdtInteres, int meses, double montoCdt){
       this.cdtInteres = 0.116;
       this.meses = meses;
       this.montoCdt = montoCdt;
    }

}
