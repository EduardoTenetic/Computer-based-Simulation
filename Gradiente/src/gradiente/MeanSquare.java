package gradiente;

public class MeanSquare{
    
    DataSet DS = new DataSet();
    Error ER = new Error();
    HelperAritmetic HA = new HelperAritmetic();
    
    double [] aux = DS.getMatrizx();
    double [] auy = DS.getMatrizy();
    
    double b0 = DS.getB0();
    double b1 = DS.getB1();
    double a = DS.getA();
    double error = DS.getError();
    
    double nb0 = 0;
    double nb1 = 0;
    
    double CalcB0;
    double CalcB1;
    
    public boolean MeanSquared(){
        
        double Error = ER.Error(nb0, nb1);
        
        while(Error > a){
            
            CalcB0 = HA.CalculateB0(nb0, nb1);
            CalcB1 = HA.CalculateB1(nb0, nb1);
            
            nb0 = nb0 - CalcB0 * a;
            nb1 = nb1 - CalcB1 * a;
            
            Error = ER.Error(nb0, nb1);
            
        }//Fin while Error > a
        
        b0 = nb0;
        b1 = nb1;
        error = Error;
        
        return true;
        
    }//Fin public boolean MeanSquared
    
    public double getB0(){
        
        return b0;
        
    }//Fin public double getB0
    
    public double getB1(){
        
        return b1;
        
    }//Fin public double getB0
    
    public double getError(){
        
        return error;
        
    }//Fin public double getB0
    
}//Fin public class MeanSquare