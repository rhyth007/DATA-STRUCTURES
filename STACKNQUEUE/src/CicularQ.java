public class CicularQ {

    int front=-1,rear=-1;
    int n;
    int arr[];

    public CicularQ(int n)
    {
        this.n = n;
        arr = new int[n];
    }


    void enqueue(int x)
    {
        if((rear+1)%n ==front)
            return;
         if(front==-1)
         front=0;
        rear=(rear+1)%n;
        arr[rear] =x;


    }
    int dequeue()
    {
        if (front==-1){
            return -1;
        }
        int res = arr[front];
        if(front==rear)
            front=rear=-1;
        else
            front = (front+1)%n;
        return res;

    }
    void printCQueue()
    {
        for (int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+"->");
        }
        System.out.print(arr[front]+"\n");

    }

    public static void main(String[] args) {
        CicularQ cicularQ =new CicularQ(3);
        cicularQ.enqueue(4);
        cicularQ.enqueue(5);
        cicularQ.enqueue(9);
        cicularQ.printCQueue();

    }



}
