/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Billy Alano
 */
public class opening extends JPanel {
    
    
    public void run(){
        ImageIcon opening = new ImageIcon("tetris.png");
        JLabel label = new JLabel("");
        
        label.setIcon(opening);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        
    }
    
    
}
