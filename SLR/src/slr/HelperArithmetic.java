package slr;

public class HelperArithmetic {
    
    DataSet DS = new DataSet();
    Calcular CL = new Calcular();
    
    int [] aux = DS.getMatrizx();
    int [] auy = DS.getMatrizy();
    
    int [] auxy = CL.CalcularXY();
    int [] aux2 = CL.CalcularX2();
    
    int sumax;
    int sumay;
    int sumaxy;
    int sumax2;
    
    public int sumatoriax(){
        
        for(int i = 0; i < 9; i++){
            
            sumax = aux[i] + sumax;
            
        }//Fin for i
        
        return sumax;
        
    }//Fin int sumatoriax
    
    public int sumatoriay(){
        
        for(int i = 0; i < 9; i++){
            
            sumay = auy[i] + sumay;
            
        }//Fin for i
        
        return sumay;
        
    }//Fin int sumatoriay
    
    public int sumatoriaxy(){
        
        for(int i = 0; i < 9; i++){
            
            sumaxy = auxy[i] + sumaxy;
            
        }//Fin for i
        
        return sumaxy;
        
    }//Fin int sumatoriaxy
    
    public int sumatoriax2(){
        
        for(int i = 0; i < 9; i++){
            
            sumax2 = aux2[i] + sumax2;
            
        }//Fin for i
        
        return sumax2;
        
    }//Fin int sumatoriaxy
    
}//Fin public class Sumatorias
