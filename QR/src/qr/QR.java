package qr;

public class QR extends Cramer{

    Cramer CR = new Cramer();
    
    double b0 = CR.getB0();
    double b1 = CR.getB1();
    double b2 = CR.getB2();
    
    public void QR(){
        
        System.out.println("B0: " + String.format("%.4f", CR.getB0()));
        System.out.println("B1: " + String.format("%.4f", CR.getB1()));
        System.out.println("B2: " + String.format("%.4f", CR.getB2()));
        
    }//Fin public void QR
    
}//Fin public class QR
