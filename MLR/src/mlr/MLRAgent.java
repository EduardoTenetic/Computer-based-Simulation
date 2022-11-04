package mlr;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class MLRAgent extends Agent {
    
    @Override
    protected void setup() {
      
        System.out.println("Agent "+getLocalName()+" started.");
        addBehaviour(new MyOneShotBehaviour());
    
    }//Fin protected void setup 

    private class MyOneShotBehaviour extends OneShotBehaviour {

        @Override
        public void action() {
            
            MLR MR = new MLR();
            
            MR.displayRegressioEquation();
            MR.predict();
            
        }//Fin public void action 

        @Override
        public int onEnd() {
            
            myAgent.doDelete();
            return super.onEnd();
    
        }//Fin public int onEnd 
    
    }//Fin private class MyCyclicBehaviour
  
}//Fin public class MLR