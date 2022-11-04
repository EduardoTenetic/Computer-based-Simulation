package qr;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class QRAgent extends Agent{
    
    @Override
    protected void setup(){
        
        System.out.println("Agent " + getLocalName() + " Started.");
        addBehaviour(new MyOneShotBehaviour());
        
    }//Fin protected void setup
    
    private class MyOneShotBehaviour extends OneShotBehaviour{
    
        @Override
        public void action(){
           
            QR qr = new QR();

            qr.QR();
            
        }//Fin public void action
    
        @Override
        public int onEnd(){
            
            myAgent.doDelete();
            return super.onEnd();
            
        }//Fin public int onDelete
        
    }//Fin private class MyOneShotBehaviour
        
}//Fin public class QRAgent