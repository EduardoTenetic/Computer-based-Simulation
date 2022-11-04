package qr;

import static java.lang.Math.pow;

public class HelperArithmetic extends DataSet{
    
    double sumax, sumay, sumax2, sumax3, sumax4, sumaxy, sumax2y;
    
    public double Sumax(){
        
        for(int i = 0; i < Iteracion; i++){
            
            sumax = x[i] + sumax;
            
        }//Fin for i
        
        return sumax;
        
    }//Fin public double Sumax
    
    public double Sumay(){
        
        for(int i = 0; i < Iteracion; i++){
            
            sumay = y[i] + sumay; 
            
        }//Fin for i
        
        return sumay;
        
    }//Fin public double Sumay
    
    public double Sumax2(){
        
        for(int i = 0; i < Iteracion; i++){
            
            sumax2 = pow(x[i], 2) + sumax2;
            
        }//Fin for i
        
        return sumax2;
        
    }//Fin public double Sumax2
    
    public double Sumax3(){
        
        for(int i = 0; i < Iteracion; i++){
            
            sumax3 = pow(x[i], 3) + sumax3;
            
        }//Fin for i
        
        return sumax3;
        
    }//Fin public double Sumax3
    
    public double Sumax4(){
        
        for(int i = 0; i < Iteracion; i++){
            
            sumax4 = pow(x[i], 4) + sumax4;
            
        }//Fin for i
        
        return sumax4;
        
    }//Fin public double Sumax4
    
    public double Sumaxy(){
        
        for(int i = 0; i < Iteracion; i++){
            
            sumaxy = x[i] * y[i] + sumaxy;
            
        }//Fin for i
        
        return sumaxy;
        
    }//Fin public double Sumaxy
    
    public double Sumax2y(){
        
        for(int i = 0; i < Iteracion; i++){
            
            sumax2y = pow(x[i], 2) * y[i] + sumax2y;
            
        }//Fin for i
        
        return sumax2y;
        
    }//Fin public double sumax2y
    
}//Fin public class HelperArithmeticNa