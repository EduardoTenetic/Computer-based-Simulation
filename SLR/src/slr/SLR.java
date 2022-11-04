package slr;

import javax.swing.JOptionPane;

public class SLR{
    
    HelperArithmetic HA = new HelperArithmetic();
    
    int sumax = HA.sumatoriax();
    int sumay = HA.sumatoriay();
    int sumaxy = HA.sumatoriaxy();
    int sumax2 = HA.sumatoriax2();
    
    float CalculateB0 = 0;
    float CalculateB1 = 0;
    float Prediction;
    
    public float CalculateB0(){
        
        CalculateB0 = (sumax2 * sumay - (sumax * sumaxy)) / ( 9 * sumax2 - (sumax * sumax));
        
        return CalculateB0;
        
    }//Fin public float CalculateB0
    
    public float CalculateB1(){
        
        CalculateB1 = ( 9 * sumaxy - (sumax * sumay)) / ( 9 * sumax2 - (sumax * sumax));
        
        return CalculateB1;
        
    }//Fin public float CalculateB1
    
    public float Prediction(float b0, float b1){
        
        float Valor = Float.parseFloat(JOptionPane.showInputDialog("Ingresa El Valor a Predecir"));
        
        Prediction = (Valor * b1) + b0;
        
        System.out.println("Prediction: " + String.format("%.3f", Prediction));
        
        return Prediction;
        
    }//Fin public float Predicction
    
    public void displayRegressioEquation(){
        
        System.out.println("Regression Equation y = B0 + B1 X1");
        
    }//Fin public void displayRegressioEquation
   
    public int sumax(){
        
        return sumax;
        
    }//Fin public int sumax
    
    public int sumay(){
        
        return sumay;
        
    }//Fin public int sumay
    
    public int sumaxy(){
        
        return sumaxy;
        
    }//Fin public int sumaxy
    
    public int sumax2(){
        
        return sumax2;
        
    }//Fin public int sumax2
    
}//Fin public class SLR