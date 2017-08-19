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
public class MyQueue<E> implements Queue<E> {
    private E[] data; 
    private int rear; 
    private int front; 
    private int count; 
    private final int MAX = 30;

    @Override
    public void initializeQueue(){
        data = (E[])new Object[MAX];
        rear = -1;
        front = 0;
    } 

    @Override
    public boolean isEmpty() {
        return(count==0);
    }

    @Override
    public boolean isFull() {
        return(count==MAX);
    }

    @Override
    public void enqueue(E item) throws QueueIndexOutOfBoundsException{
        if(!isFull()){
            rear = (rear+1)%MAX; 
            data[rear] = item; 
            count++;
        }
        else
            dequeue();
        }

    @Override
    public void dequeue() throws QueueIndexOutOfBoundsException {
        if(!isEmpty()){
            front = (front+1)%MAX;
            count--; 
        }
        else
            throw new QueueIndexOutOfBoundsException("Queue is Empty"); 
        }    

    @Override
    public E getFront(){
        return data[front];
    }

    @Override
    public E getRear(){
        return data[rear];
    }

    @Override
    public int getSize(){
        return count;
    }
}