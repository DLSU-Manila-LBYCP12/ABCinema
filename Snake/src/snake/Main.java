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
import acm.graphics.GImage;
import static acm.util.JTFTools.pause;
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame implements SnakeConstants{
    private DataScreen board;
    private Side side;
    private Random random;
    private Time timer;
    private boolean isNewGame;
    private boolean isGameOver;
    private boolean isPaused;
    private LinkedList<Direction> directions;
    private LinkedList<Point> snake;
    private int fruitsEaten;
    //private Opening open;

    private Main(){
        super("ABCinema Mini Game: Snake");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        
        //this.open = new Opening(this);
        this.board = new DataScreen(this);
        this.side = new Side(this);
        
        
        //pause(500);
        //removeAll();
        
        
        add(board, BorderLayout.CENTER);
        add(side, BorderLayout.EAST);
        
        addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                switch(e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        if(!isPaused && !isGameOver){
                            if(directions.size() < maxDirections){
                                Direction last = directions.peekLast();
                                if(last != Direction.north && last != Direction.south){
                                    directions.addLast(Direction.north);
                                }
                            }
                        }
                        break;
                    
                    case KeyEvent.VK_DOWN:
                        if(!isPaused && !isGameOver){
                            if(directions.size() < maxDirections){
                                Direction last = directions.peekLast();
                                if(last != Direction.north && last != Direction.south){
                                    directions.addLast(Direction.south);
                                }
                            }
                        }
                        break;
                        
                    case KeyEvent.VK_LEFT:
                        if(!isPaused && !isGameOver){
                            if(directions.size() < maxDirections){
                                Direction last = directions.peekLast();
                                if(last != Direction.east && last != Direction.west){
                                    directions.addLast(Direction.west);
                                }
                            }
                        }
                        break;
                        
                    case KeyEvent.VK_RIGHT:
                        if(!isPaused && !isGameOver){
                            if(directions.size() < maxDirections){
                                Direction last = directions.peekLast();
                                if(last != Direction.west && last != Direction.east){
                                    directions.addLast(Direction.east);
                                }
                            }
                        }
                        break;
                        
                    case KeyEvent.VK_P:
                        if(!isGameOver){
                            isPaused = !isPaused;
                            timer.setPaused(isPaused);
                        }
                        break;
                        
                    case KeyEvent.VK_ENTER:
                        if(isNewGame || isGameOver){
                            resetGame();
                        }
                        break;
                }
            }
        });
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        }
    
        public Direction getDirection(){
            return directions.peek();
        }
        
        private void startGame(){
            this.random = new Random();
            this.isNewGame = true;
            this.timer = new Time(9.0f);
            this.directions = new LinkedList<>();
            this.snake = new LinkedList<>();
        
            timer.setPaused(true);
            
            while(true){
                timer.update();
                if(timer.hasElapsedCycle()){
                    updateGame();
                }
                
                board.repaint();
                side.repaint();
                
            }
        }
        
        private snakePart updateSnake(){
            Direction direction = directions.peekFirst();
            Point head = new Point(snake.peekFirst());
            switch(direction){
                case north:
                    head.y--;
                    break;
                    
                case south:
                    head.y++;
                    break;
                    
                case west:
                    head.x--;
                    break;
                    
                case east:
                    head.x++;
                    break;
            }
            if(head.x < 0 || head.x >= DataScreen.columnCount || head.y < 0 || head.y >= DataScreen.rowCount){
                return snakePart.snakeBody;
            }
            
            snakePart old = board.getTile(head.x, head.y);
            if(old != snakePart.fruit && snake.size() > minSnakeLength){
                Point tail = snake.removeLast();
                board.setTile(tail, null);
                old = board.getTile(head.x, head.y);
            }
            
            if(old != snakePart.snakeBody){
                board.setTile(snake.peekFirst(), snakePart.snakeBody);
                snake.push(head);
                board.setTile(head, snakePart.snakeHead);
                if(directions.size() > 1){
                    directions.poll();
                }
            }
            return old;
        }
        
        private void resetGame(){
            this.fruitsEaten = 0;
            this.isNewGame = false;
            this.isGameOver = false;
            
            Point head = new Point(DataScreen.columnCount/2, DataScreen.rowCount /2);
            snake.clear();
            snake.add(head);
            
            board.clearBoard();
            board.setTile(head, snakePart.snakeHead);
            
            directions.clear();
            directions.add(Direction.north);
            
            timer.reset();
            
            spawnFruit();
        }
        
        public boolean isNewGame(){
            return isNewGame;
        }
        
        public boolean isGameOver(){
            return isGameOver;
        }
        
        public boolean isPaused(){
            return isPaused;
        }
        
        public int getFruitsEaten(){
            return fruitsEaten;
        }
        
        public void spawnFruit(){
            int index = random.nextInt(DataScreen.columnCount * DataScreen.rowCount - snake.size());
            int freeFound = -1;
            for(int x = 0; x < DataScreen.columnCount; x++){
                for (int y = 0; y < DataScreen.rowCount; y++){
                    snakePart type = board.getTile(x,y);
                if(type == null || type == snakePart.fruit){
                    if(++freeFound == index){
                        board.setTile(x, y, snakePart.fruit);
                        break;
                        }
                    }
                }
            }
        }
        
        private void updateGame(){
            snakePart collide = updateSnake();
            if (collide == snakePart.fruit){
                fruitsEaten++;
                spawnFruit();
            } else if(collide == snakePart.snakeBody){
                isGameOver = true;
                timer.setPaused(true);
            }
        }
        
        public static void main(String[] args){
            Main snake = new Main();
            snake.startGame();
        }
        
}
