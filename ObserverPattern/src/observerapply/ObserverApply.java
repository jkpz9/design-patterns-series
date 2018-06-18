/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerapply;

/**
 *
 * @author hayes96
 */
public class ObserverApply {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      FormA a = new FormA();
      a.setVisible(true);
      FomrB b = new FomrB();
      b.setVisible(true);
      
      a.setAudience(b);
    }
    
}
