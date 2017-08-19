/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import acmx.export.javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import static jdk.nashorn.internal.objects.Global.println;
public class Tetris extends JFrame {
	private static final long FRAME_TIME = 1000L / 50L;
	private static final int TYPE_COUNT = Tiles.values().length;
	private Main board;
	private final Menu side;
	private boolean isPaused;
	private boolean isNewGame;
	private boolean isGameOver;
	private int level;
	private int score;
	private Random random;
        private Speed logicTimer;
	private Tiles orginTile;
	private Tiles nextTile;
	private int Columb;
	private int Row;
	private int Rotation;
	private int dropCooldown;
	private float gameSpeed;
	public Tetris() {
		super("Tetris");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		this.board = new Main(this);
		this.side = new Menu(this);
		add(board, BorderLayout.CENTER);
		add(side, BorderLayout.EAST);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_S:
					if(!isPaused && dropCooldown == 0) {
						logicTimer.setCyclesPerSecond(25.0f);
					}
					break;
				case KeyEvent.VK_A:
					if(!isPaused && board.isValidAndEmpty(orginTile, Columb - 1, Row, Rotation)) {
						Columb--;
					}
					break;
				case KeyEvent.VK_D:
					if(!isPaused && board.isValidAndEmpty(orginTile, Columb + 1, Row, Rotation)) {
						Columb++;
					}
					break;
				case KeyEvent.VK_Q:
					if(!isPaused) {
						rotatePiece((Rotation == 0) ? 3 : Rotation - 1);
					}
					break;
				case KeyEvent.VK_E:
					if(!isPaused) {
						rotatePiece((Rotation == 3) ? 0 : Rotation + 1);
					}
					break;
				case KeyEvent.VK_P:
					if(!isGameOver && !isNewGame) {
						isPaused = !isPaused;
						logicTimer.setPaused(isPaused);
					}
					break;
				case KeyEvent.VK_ENTER:
					if(isGameOver || isNewGame) {
						resetGame();
					}
					break;
                                 
                                }
			}                            
			@Override
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_S:
					logicTimer.setCyclesPerSecond(gameSpeed);
					logicTimer.reset();
					break;
				}
				
			}			
		});
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}        
	private void startGame() {                    
		this.random = new Random();                
		this.isNewGame = true;
		this.gameSpeed = 1.0f;
		this.logicTimer = new Speed(gameSpeed);
		logicTimer.setPaused(true);
		while(true) {
			long start = System.nanoTime();
			logicTimer.update();
			if(logicTimer.hasElapsedCycle()) {
				updateGame();
			}
			if(dropCooldown > 0) {
				dropCooldown--;
			}
			renderGame();
			long delta = (System.nanoTime() - start) / 1000000L;
			if(delta < FRAME_TIME) {
				try {
					Thread.sleep(FRAME_TIME - delta);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	private void updateGame() {
		if(board.isValidAndEmpty(orginTile, Columb, Row + 1, Rotation)) {
			Row++;
		} else {
			board.addPiece(orginTile, Columb, Row, Rotation);
			int cleared = board.checkLines();
			if(cleared > 0) {
				score += 50 << cleared;
			}
			gameSpeed += 0.035f;
			logicTimer.setCyclesPerSecond(gameSpeed);
			logicTimer.reset();
			dropCooldown = 25;
			level = (int)(gameSpeed * 1.70f);
			spawnPiece();
		}		
	}
	private void renderGame() {
		board.repaint();
		side.repaint();
	}
	private void resetGame() {
		this.level = 1;
		this.score = 0;
		this.gameSpeed = 1.0f;
		this.nextTile = Tiles.values()[random.nextInt(TYPE_COUNT)];
		this.isNewGame = false;
		this.isGameOver = false;		
		board.clear();
		logicTimer.reset();
		logicTimer.setCyclesPerSecond(gameSpeed);
		spawnPiece();
	}
	private void spawnPiece() {
		this.orginTile = nextTile;
		this.Columb = orginTile.getSpawnColumn();
		this.Row = orginTile.getSpawnRow();
		this.Rotation = 0;
		this.nextTile = Tiles.values()[random.nextInt(TYPE_COUNT)];
		if(!board.isValidAndEmpty(orginTile, Columb, Row, Rotation)) {
			this.isGameOver = true;
			logicTimer.setPaused(true);
		}		
	}
	private void rotatePiece(int newRotation) {
		int newColumn = Columb;
		int newRow = Row;
		int left = orginTile.getLeftInset(newRotation);
		int right = orginTile.getRightInset(newRotation);
		int top = orginTile.getTopInset(newRotation);
		int bottom = orginTile.getBottomInset(newRotation);
		if(Columb < -left) {
			newColumn -= Columb - left;
		} else if(Columb + orginTile.getDimension() - right >= Main.COL_COUNT) {
			newColumn -= (Columb + orginTile.getDimension() - right) - Main.COL_COUNT + 1;
		}
		if(Row < -top) {
			newRow -= Row - top;
		} else if(Row + orginTile.getDimension() - bottom >= Main.ROW_COUNT) {
			newRow -= (Row + orginTile.getDimension() - bottom) - Main.ROW_COUNT + 1;
		}
		if(board.isValidAndEmpty(orginTile, newColumn, newRow, newRotation)) {
			Rotation = newRotation;
			Row = newRow;
			Columb = newColumn;
		}
	}
	public boolean isPaused() {
		return isPaused;
	}
	public boolean isGameOver() {
		return isGameOver;
	}
	public boolean isNewGame() {
		return isNewGame;
	}
	public int getScore() {
		return score;
	}
	public int getLevel() {
		return level;
	}
	public Tiles getTile() {
		return orginTile;
	}
	public Tiles getNextPieceTile() {
		return nextTile;
	}
	public int getColumb() {
		return Columb;
	}
	public int getRow() {
		return Row;
	}
	public int getRotation() {
		return Rotation;
	}
	public static void main(String[] args) {
		Tetris tetris = new Tetris();
		tetris.startGame();
	}

}