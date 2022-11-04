package slr;

import static java.lang.Math.pow;

public class Calcular {
    
    DataSet DS = new DataSet();
    
    int [] aux = DS.getMatrizx();
    int [] auy = DS.getMatrizy();
    int [] auxy = new int [9];
    int [] aux2 = new int [9];
    
    public int [] CalcularXY(){
        
        for(int i = 0; i < 9; i++){
            
            auxy[i] = aux[i] * auy[i];
            
        }//Fin for i 
        
        return auxy;
        
    }//Fin public int [] CalcularXY
    
    public int [] CalcularX2(){
        
        for(int i = 0; i < 9; i++){
            
            aux2[i] = (int) pow((aux[i]), 2);
            
        }//Fin i
        
        return aux2;
        
    }//Fin public int [] CalcularX2
    
}//Fin public class Calcular