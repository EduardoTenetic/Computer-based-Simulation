package gradiente;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class GRAgent extends Agent{
    
    @Override
    protected void setup(){
        
        System.out.println("Agent " + getLocalName() + " Started.");
        addBehaviour(new MyOneShotBehaviour());
        
    }//Fin protected void setup
    
    private class MyOneShotBehaviour extends OneShotBehaviour{
        
        @Override
        public void action(){
            
            Gradiente GR = new Gradiente();
            
            System.out.println("");
            GR.displayGradienteEquation();
            System.out.println("");
            GR.Beta0();
            GR.Beta1();
            System.out.println("");
            GR.Error();
            System.out.println("");
            GR.predict();
            
        }//Fin public void action
    
        @Override
        public int onEnd(){
            
            myAgent.doDelete();
            return super.onEnd();
            
        }//Fin public int onDelete
        
    }//Fin private class MyOneShotBehaviour
    
}//Fin public class Gradiente