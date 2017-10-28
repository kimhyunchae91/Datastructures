/**
 * Created by Hyun on 8/4/2017.
 */
public class Queue {
    private int maxSize;
    private long[] queArr;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int val){
        maxSize = val;
        queArr = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j){ // inserting the value in the rear
        if(rear == maxSize - 1){ // deal with wraparound?
            rear = -1;
        }
        queArr[++rear] = j; // increment rear, insert value in the rear.
        nItems++; // increment count
    }

    public long remove(){
        long temp = queArr[front++];
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArr[front];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public int size(){
        return nItems;
    }
}
