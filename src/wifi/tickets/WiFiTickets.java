/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wifi.tickets;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER-PC
 */
public class WiFiTickets {

    String usuario = Login.Usuario.getText();
    String Contraseña = String.valueOf(Login.Contraseña.getPassword());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new Login().setVisible(true);
       
      
    }

}