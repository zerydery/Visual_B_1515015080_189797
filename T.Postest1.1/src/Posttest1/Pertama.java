/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest1;

/**
 *
 * @author Spitzery
 */
public class Pertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater
        (
                new Runnable()
                {
                    public void run()
                    {
                        new frmHelloWord().setVisible(true);
                    }
                }
        );
    }
    
}
