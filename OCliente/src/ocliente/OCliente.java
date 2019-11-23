/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocliente;

import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author old_adam
 */
public class OCliente {
    public static String ip = "192.168.0.103";
    public static int porta = 5353;

    /**
     * Ponto de entrada da execucao do app.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaLogin jL = new JanelaLogin();
        jL.setVisible(true);
    }
    
}
