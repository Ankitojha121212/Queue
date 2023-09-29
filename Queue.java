import java.util.*;
class Queue{
    int front=-1,rear=-1;
    int[] q=new int[10];
    int  n=q.length;
    public void enqueue(int data){
        if(rear==n-1)
            System.out.println("Queue overflow");
        else if(rear == -1 && front == -1)
        {
            front++;
            rear++;
            q[rear]=data;
        }
        else {
            rear++;
            q[rear]=data;
        }
    }
    public int De(){
        int store;
        if (front == -1)
            System.out.println("Queue underflow");
        else if (front == rear) {
            store = q[front];
            front = rear = -1;
            return store;
        }
        else {
            store = q[front];
            front++;
        return store;
        }
        return 0;
    }
    public void Display(){
        for(int i=0;i<n;i++){
            System.out.println(q[front]);
            front++;
        }
    }
}
public class Main
{
    public static void main(String[] args){
        Queue q=new Queue();
        q.enqueue(50);
        q.enqueue(5437);
        q.enqueue(43756);
        q.enqueue(543765);
        q.enqueue(543987654);
        q.enqueue(543876);
        q.enqueue(5438);
        q.enqueue(59843);
        q.enqueue(43);
        q.enqueue(535);
        q.enqueue(543876);
        q.enqueue(543098);
        q.enqueue(543765);
        q.enqueue(543765);
        q.enqueue(543654);
        System.out.println(q.De());
        q.Display();

    }
}