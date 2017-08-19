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

public class DataScreen extends JPanel implements SnakeConstants{
    
    private Main game;
    private snakePart[] tiles;
    private static final Font font = new Font("Tahome", Font.BOLD, 30);
    
    private void drawTile(int x, int y, snakePart type, Graphics g){
        switch(type){
            case fruit:
                Color fruitC = Color.decode("#A93226");
                g.setColor(fruitC);
                g.fillOval(x+2, y+2, tileSize - 4, tileSize - 4);
                break;
            case snakeBody:
                Color bodyC = Color.decode("#2D2A69");
                g.setColor(bodyC);
                g.fillRect(x, y, tileSize, tileSize);
                break;
            case snakeHead:
                Color headC = Color.decode("#2D2A69");
                g.setColor(headC);
                g.fillRect(x, y, tileSize, tileSize);
                g.setColor(Color.black);
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
    
    public void setTile(int x, int y, snakePart part){
        tiles[y * rowCount + x] = part;
    }
    
    public void setTile(Point point, snakePart part){
        setTile(point.x, point.y, part);
    }
    
    public snakePart getTile(int x, int y){
        return tiles[y * rowCount + x];
    }
    
    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        for(int x = 0; x < columnCount; x++){
            for(int y = 0; y < rowCount; y++){
                snakePart part = getTile(x,y);
                if(part != null){
                    drawTile(x * tileSize, y * tileSize, part, graphics);
                }
            }
        }
        
        Color tileColor = Color.decode("#FAE5D3");
        
        graphics.setColor(tileColor);
        graphics.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        for(int x = 0; x < columnCount; x++){
            for(int y = 0; y < rowCount; y++){
                graphics.drawLine(x * tileSize, 0, x * tileSize, getHeight());
                graphics.drawLine(0, y * tileSize, getWidth(), y * tileSize);
            }
        }
        
        Color gameC = Color.decode("#F97300");
        
        if(game.isGameOver() || game.isNewGame() || game.isPaused()){
            graphics.setColor(gameC);
            int centerX = getWidth()/2;
            int centerY = getHeight()/2;
            
            String largeMessage = null;
            String smallMessage = null;
            if(game.isNewGame()){
                largeMessage = "Snake!";
                smallMessage = "Press ENTER to start";
            } else if(game.isGameOver()){
                largeMessage = "Game Over!";
                smallMessage = "Press ENTER to restart";
            } else if(game.isPaused()){
                largeMessage = "Paused";
                smallMessage = "Press P to continue";
            }
            graphics.setFont(font);
            graphics.drawString(largeMessage, centerX - graphics.getFontMetrics().stringWidth(largeMessage)/2, centerY - 50);
            graphics.drawString(smallMessage, centerX - graphics.getFontMetrics().stringWidth(smallMessage)/2, centerY + 50);
        }
    }
    
}