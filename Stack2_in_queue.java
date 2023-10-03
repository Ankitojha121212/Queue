import java.util.Stack;
class Que{
    static  Stack<Integer> s1 = new Stack<>();//creating stack 1
   static Stack<Integer> s2 = new Stack<>();//creating stack 2
   public void enqueue(int data){
        s1.push(data);//pushing the input data in stack 1
   }
   public void dequeue(){
   while(!s1.isEmpty()){
    s2.push(s1.pop());// poping the elements from stack1 and pushing into stack2 till the stack1 is not empty.
   }
    System.out.println(s2.pop());//printing the stack2 elements which are showing behaviour like queue.
   }
}
class Stack2_in_queue{
     public static void main(String[] args) {
         Que q = new Que();
         q.enqueue(1);
         q.enqueue(2);
         q.enqueue(3);
         q.enqueue(4);
         q.enqueue(5);
         q.enqueue(6);
     //    q.enqueue(4);
       //  q.enqueue(5);

      q.dequeue();
         q.dequeue();
         q.dequeue();
         q.dequeue();
        
    }
}