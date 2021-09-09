package tarleton.datastructures;

/**
 *
 * @author Joe Meier
 */
public class Queue {
    private int[] curQueue;
    private int head, tail, size;

    public Queue(int size) {
        this.size = size;
        this.head = -1;
        this.tail = -1;
        this.curQueue = new int[size];
    }
    
    public void append(int item){
        if (isFull()){
            throw new QueueException("Full Queue.");
        }
        if (isEmpty()){
            this.head = 0;
            this.tail = 0;
            this.curQueue[this.tail] = item;
        }
        else {
            this.tail = (this.tail + 1) % this.size;
            this.curQueue[this.tail] = item;
        }
    }
    
    public int get(){
        if (isEmpty()){
            throw new QueueException("Empty Queue.");
        }
        if (this.head == this.tail){
            int item = this.curQueue[this.head];
            this.head = -1;
            this.tail = -1;
            return item;
        }
        else{
            int item = this.curQueue[this.head];
            this.head = (this.head + 1) % this.size;
            return item;
        }
    }
    
    public boolean isFull(){
        return ((this.tail + 1) % this.size == this.head);
    }
    
    public boolean isEmpty(){
        return this.head == -1;
    }
}
