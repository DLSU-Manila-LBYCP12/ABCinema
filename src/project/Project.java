/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.HomePage;
import acm.program.*;
/**
 *
 * @author christinecarylchen
 */
public class Project extends Program {

    private HomePage HomePage;

    public void run(){
        HomePage = new HomePage();
        
    }
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Project().start(args);
// TODO code application logic here
    }
    
}
