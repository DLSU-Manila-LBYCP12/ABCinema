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
public class Time {
    private float milliPerCycle;
    private long lastUpdate;
    private int elapsedCycle;
    private float excessCycle;
    private boolean isPaused;
    
    public Time(float cyclesPerSecond){
        setCyclesPerSecond(cyclesPerSecond);
        reset();
    }
    
    public void setCyclesPerSecond(float cyclesPerSecond){
        this.milliPerCycle = (1.0f / cyclesPerSecond) * 1000;
    }
    
    public void reset(){
        this.elapsedCycle = 0; 
        this.excessCycle = 0.0f;
        this.lastUpdate = getCurrentTime();
        this.isPaused = false;
    }
    
    private static final long getCurrentTime(){
        return (System.nanoTime()/1000000L);
    }
    
    public void update(){
        long currentUpdate = getCurrentTime();
        float delta = (float)(currentUpdate - lastUpdate) + excessCycle;
        
        if(!isPaused){
            this.elapsedCycle += (int)Math.floor(delta/milliPerCycle);
            this.excessCycle = delta % milliPerCycle;
        }
        this.lastUpdate = currentUpdate;
    }
    
    public boolean peekElapsedCycle(){
        return(elapsedCycle > 0);
    }
    
    public boolean hasElapsedCycle(){
        if(elapsedCycle > 0){
            this.elapsedCycle--;
            return true;
        }
        return false;
    }
    
    public void setPaused(boolean paused){
        this.isPaused = paused;
    }
    
    public boolean isPaused(){
        return isPaused;
    }
    
}
