/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

/**
 *
 * @author Fides
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JPanel;

public class Side extends JPanel {
    private Main game;
    private static final int statisticsOffset = 150;
    private static final int controlsOffset = 320;
    private static final int message = 30;
    private static final int smallOffset = 30;
    private static final int largeOffset = 50;
    private static final Font largeFont = new Font("Tahoma", Font.BOLD, 20);
    private static final Font mediumFont = new Font("Tahome", Font.BOLD,16);
    private static final Font smallFont = new Font("Tahoma", Font.BOLD, 12);
    
    Color sidebg = Color.decode("#A04000");
    Color text = Color.decode("#FAE5D3");
    
    public Side(Main game){
        this.game = game;
        setBackground(sidebg);
        setPreferredSize(new Dimension(300, DataScreen.rowCount * DataScreen.tileSize));
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(text);
        g.setFont(largeFont);
        g.drawString("Snake Game", getWidth()/2 - g.getFontMetrics().stringWidth("Snake Game") / 2, 50);
        g.setFont(mediumFont);
        g.drawString("Statistics", smallOffset, statisticsOffset);
        g.drawString("Controls", smallOffset, controlsOffset);
        g.setFont(smallFont);
        
        int drawY = statisticsOffset;
        
	g.drawString("Fruit Eaten: " + game.getFruitsEaten(), largeOffset, drawY += message);
        
        drawY = controlsOffset;
        
        g.drawString("Move Up: Up Arrowkey", largeOffset, drawY += message);
	g.drawString("Move Down: Down Arrowkey", largeOffset, drawY += message);
	g.drawString("Move Left: Left Arrowkey", largeOffset, drawY += message);
	g.drawString("Move Right: Right Arrowkey", largeOffset, drawY += message);
	g.drawString("Pause Game: P", largeOffset, drawY += message);
    }

}
