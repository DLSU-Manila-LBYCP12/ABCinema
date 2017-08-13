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
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

public class DataScreen extends JPanel {
    public static final int columnCount = 25;
    public static final int rowCount = 25;
    public static final int tileSize = 20;
    public static final int eyeLarge = tileSize/3;
    public static final int eyeSmall = tileSize/6;
    public static final int eyeLength = tileSize/5;
    private Main game;
    private snakePart[] tiles;
    private static final Font font = new Font("Tahoma", Font.BOLD, 25);
    
    private void drawTile(int x, int y, snakePart type, Graphics g){
        switch(type){
            case fruit:
                Color fruitC = Color.decode("#A93226");
                g.setColor(fruitC);
                g.fillOval(x+2, y+2, tileSize - 4, tileSize - 4);
                break;
            case snakeBody:
                Color bodyC = Color.decode("#1E8449");
                g.setColor(bodyC);
                g.fillRect(x, y, tileSize, tileSize);
                break;
            case snakeHead:
                Color headC = Color.decode("#1E8449");
                g.setColor(headC);
                g.fillRect(x, y, tileSize, tileSize);
                g.setColor(Color.black);
        
        switch(game.getDirection()){
            case north:{
                int baseY = y + eyeSmall;
                g.drawLine(x + eyeLarge, baseY, x + eyeLarge, baseY + eyeLength);
                g.drawLine(x + tileSize - eyeLarge, baseY, x + tileSize - eyeLarge, baseY + eyeLength);
                break;
            }
            case south:{
                int baseY = y + tileSize - eyeSmall;
                g.drawLine(x + eyeLarge, baseY, x + eyeLarge, baseY - eyeLength);
                g.drawLine(x + tileSize - eyeLarge, baseY, x + tileSize - eyeLarge, baseY - eyeLength);
                break;
            }
            case west:{
                int baseX = x + eyeSmall;
                g.drawLine(baseX, y + eyeLarge, baseX + eyeLength, y + eyeLarge);
                g.drawLine(baseX, y + tileSize - eyeLarge, baseX + eyeLength, y + tileSize - eyeLarge);
                break;
            }
            case east:{
                int baseX = x + tileSize +-eyeSmall;
                g.drawLine(baseX, y + eyeLarge, baseX - eyeLength, y + eyeLarge);
                g.drawLine(baseX, y + tileSize - eyeLarge, baseX - eyeLength, y + tileSize - eyeLarge);
                break;    
            }
        }
        break;
        }
    }
    
    Color main = Color.decode("#FDF2E9");
    
    public DataScreen(Main game){
        this.game = game;
        this.tiles = new snakePart[rowCount * columnCount];
        setPreferredSize(new Dimension(columnCount * tileSize, rowCount * tileSize));
        setBackground(main);
    }
    
    public void clearBoard(){
        for(int i = 0; i < tiles.length; i++){
            tiles[i] = null;
        }
    }
    
    public void setTile(int x, int y, snakePart type){
        tiles[y * rowCount + x] = type;
    }
    
    public void setTile(Point point, snakePart type){
        setTile(point.x, point.y, type);
    }
    
    public snakePart getTile(int x, int y){
        return tiles[y * rowCount + x];
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int x = 0; x < columnCount; x++){
            for(int y = 0; y < rowCount; y++){
                snakePart type = getTile(x,y);
                if(type != null){
                    drawTile(x * tileSize, y * tileSize, type, g);
                }
            }
        }
        
        Color tileColor = Color.decode("#FAE5D3");
        
        g.setColor(tileColor);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        for(int x = 0; x < columnCount; x++){
            for(int y = 0; y < rowCount; y++){
                g.drawLine(x * tileSize, 0, x * tileSize, getHeight());
                g.drawLine(0, y * tileSize, getWidth(), y * tileSize);
            }
        }
        
        Color gameC = Color.decode("#A04000");
        
        if(game.isGameOver() || game.isNewGame() || game.isPaused()){
            g.setColor(gameC);
            int centerX = getWidth()/2;
            int centerY = getHeight()/2;
            
            String largeMessage = null;
            String smallMessage = null;
            if(game.isNewGame()){
                largeMessage = "Snake Game";
                smallMessage = "Press ENTER to start";
            } else if(game.isGameOver()){
                largeMessage = "Game Over";
                smallMessage = "Press ENTER to restart";
            } else if(game.isPaused()){
                largeMessage = "Paused";
                smallMessage = "Press P to resume";
            }
            g.setFont(font);
            g.drawString(largeMessage, centerX - g.getFontMetrics().stringWidth(largeMessage)/2, centerY - 50);
            g.drawString(smallMessage, centerX - g.getFontMetrics().stringWidth(smallMessage)/2, centerY + 50);
        }
    }
    
}