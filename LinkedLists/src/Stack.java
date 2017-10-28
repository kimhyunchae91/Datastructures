/**
 * Created by Hyun on 7/27/2017.
 */
public class Stack {
    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top;    // top of stack

    public Stack(int s){ // Constructor
        maxSize = s;
        stackArray = new long[maxSize]; // create array;
        top = -1;       // no items yet
    }

    public void push(long j){
        stackArray[++top] = j; // increment top, insert item
    }

    public long pop(){
        return stackArray[top--];
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }
}

class Stack2{
    private int maxValue;
    private int[] stackArr;
    private int top;

    public Stack2(int value){
        maxValue = value;
        stackArr = new int[maxValue];
        top = -1;
    }

    void push(int val){
        stackArr[++top] = val; // increment top, insert item
    }

    long pop(){
        return stackArr[top--]; // return stackArr, decrement top.
    }

    long peek(){
        return stackArr[top]; // access stackArr
    }

    boolean isEmpty(){
        return top == -1; // return true only when top is equal to -1
    }

    boolean isFull(){
        return top == maxValue - 1;
    }

    int size(){
        return top + 1;
    }

    public void displayStack(){
        for(int i = 0; i < size(); i++){
            System.out.print(stackArr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }


}

class XStack{
    private int max;
    private int[] stackArr;
    private int top;

    public XStack(int v){
        max = v;
        stackArr = new int[max];
        top = -1;
    }

    boolean isEmpty(){
        return top < 0;
    }

    boolean isFull(){
        return top > max - 1;
    }

    void push(int value){
        if(top > max - 1){
            throw new IllegalArgumentException();
        }else{
            stackArr[++top] = value;
        }
    }

    int pop(){
       if(top < 0){
           System.out.println("Stack Underflow!");
           return 0;
       }else{
           return stackArr[top--];
       }
    }

    int peek(){
        return stackArr[top];
    }

    int size(){
        return top + 1;
    }

    /*
    Default methods:
    1. isEmpty()
    2. isFull()
    3. push
    4. pop
    5. peek
    6. size
     */
}

