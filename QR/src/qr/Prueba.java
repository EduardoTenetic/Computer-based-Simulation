package qr;

public class Prueba {

    public static void main(String[] args){
        
        HelperArithmetic HA = new HelperArithmetic();
        
        Cramer CR = new Cramer();
        QR qr = new QR();        
        
        System.out.println("Sumax:   " + String.format("%.2f", HA.Sumax()));
        System.out.println("Sumay:   " + String.format("%.2f", HA.Sumay()));
        System.out.println("Sumax2:  " + String.format("%.2f", HA.Sumax2()));
        System.out.println("Sumax3:  " + String.format("%.2f", HA.Sumax3()));
        System.out.println("Sumax4:  " + String.format("%.2f", HA.Sumax4()));
        System.out.println("Sumaxy:  " + String.format("%.2f",  HA.Sumaxy()));
        System.out.println("Sumax2y: " + String.format("%.2f", HA.Sumax2y()));
              
        System.out.println("");
        
        System.out.println("Determinante: " + String.format("%.4f", CR.getDeterminante()));
        
        System.out.println("");
        
        System.out.println("B0: " + String.format("%.4f", CR.getB0()));
        System.out.println("B1: " + String.format("%.4f", CR.getB1()));
        System.out.println("B2: " + String.format("%.4f", CR.getB2()));
        
    }
    
}
