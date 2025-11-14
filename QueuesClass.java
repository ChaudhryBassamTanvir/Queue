public class QueuesClass {


    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
static int front=-1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear==-1 && front ==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }


    //add or enqueue
    public static void add(int data){
if (isFull()) {
    System.out.println("Full queue");
    return;
    
}
//f
if (front ==-1) {
front=0;
}


        if (rear==size-1) {
            System.out.println("Full queue");
            return;
        }
        // rear++;
        // arr[rear]=data;
    rear=(rear+1)%size;
    arr[rear]=data;
    }

    //dequeue or remove
public static int remove(){
    if (isEmpty()) {
        return -1;

        
    }
int front = arr[0];
for (int i = 0; i <rear; i++) {
arr[i]=arr[i+1];

}
rear--;

return front;

}

//peek
public static int peek(){
    if (isEmpty()) {
        return -1;

        
    }
return arr[0];
}
    }



    public static void main(String[] args) {
     //enque Add
     // Dequeue Remove
     //Front Peek
     

     Queue q = new Queue(5);
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);


     while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
     }
     

    }
}
