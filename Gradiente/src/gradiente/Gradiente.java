package gradiente;

import javax.swing.JOptionPane;

public class Gradiente{
    
    MeanSquare MS = new MeanSquare();
    
    boolean Metalera = MS.MeanSquared();
    
    double b0 = MS.getB0();
    double b1 = MS.getB1();
    
    public void displayGradienteEquation(){
        
        System.out.println("                               ┌                ┐");
        System.out.println("                               │ a/aB0 ƒ(B0,B1) │");
        System.out.println("Gradient Equation ▼ƒ(B0, B1) =│                │");
        System.out.println("                               │ a/aB1 ƒ(B0,B1) │");
        System.out.println("                               └                ┘");
        
    }//Fin public void displayRegressioEquation
    
    public void Error(){
        
        System.out.println("Error: " + String.format("%.7f", MS.getError()));
        
    }//Fin public void Error
    
    public double predict(){
        
        double Valor = Float.parseFloat(JOptionPane.showInputDialog("Ingresa El Valor a Predecir"));
        
        double predict = (Valor * b0) + b1;
        
        System.out.println("Predict: " + predict);
        
        return predict;
        
    }//Fin public float predict
    
    public void Beta0(){
        
        System.out.println("B0: " + b0);
        
    }//Fin public void Beta0
    
    public void Beta1(){
        
        System.out.println("B1: " + b1);
        
    }//Fin public void Beta1
    
}//Fin public class Gradiente