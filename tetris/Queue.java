/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

/**
 *
 * @author Billy Alano
 */
public interface Queue<E> {
    
    public void initializeQueue();
    
    public boolean isEmpty(); 
    
    public boolean isFull(); 
    
    public void enqueue(E item); 
    
    public void dequeue();
    
    public E getFront(); 
    
    public E getRear(); 
    
    public int getSize();
}