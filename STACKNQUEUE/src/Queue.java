import java.util.Scanner;

public class Queue {

    int front,rear;
    int capacity;
    int arr[];

    public Queue(int capacity)
    {
        this.capacity = capacity;
        arr = new int[capacity];
        rear = -1;

    }

    void enqueue(int x)
    {
        if(rear==capacity-1)
        {
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        arr[rear] = x;


    }
    int dequeue()
    {
        if(rear==-1)
        {
            System.out.println("Queue is EMpty");
            return -1;
        }
        int res = arr[0];
        for(int i=0;i<rear;i++)
        {
            arr[i] = arr[i+1];
        }
        rear--;
        return res;


    }
    int getFront()
    {
        if(rear==-1)
        {
            System.out.println("Queue is EMpty");
            return -1;
        }
        return arr[0];

    }

    int getRear()
    {
        if(rear==-1) {
            System.out.println("Queue is EMpty");
            return -1;
        }
        return arr[rear];
    }

    boolean isEmpty()
    {
        if(rear==-1)
            return true;
        return false;
    }
    boolean isFull()
    {
        if(rear==capacity-1)
            return true;
        return false;
    }
    void printQueue()
    {
        for(int i=0;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int size=0;
        System.out.println("Enter the Size of Queue");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        Queue queue = new Queue(size);
        while (true)
        {

            System.out.println("Press 1 for Enqueue----Press 2 for Dequeue----Press 3 for Front Element----Press 4 for Rear Element----Press 5 to check isEmpty\n");
            int c = scanner.nextInt();

            switch (c)
            {
                case 1:
                    System.out.println("Enter element to Enqueue");
                    int x = scanner.nextInt();
                    queue.enqueue(x);
                    break;
                case 2 :
                    System.out.println("\nDequeued Element is"+queue.dequeue()+"\n");
                    break;
                case 3:
                    System.out.println("Front Element is "+queue.getFront()+"\n");
                    break;
                case 4:
                    System.out.println("Rear Element is "+queue.getRear()+"\n");
                    break;
                case 5:
                    queue.printQueue();
                    break;
                case 6:
                    System.out.println(queue.isEmpty());
                    break;
                case 7:
                    System.out.println(queue.isFull());
                    break;

                default:
                    System.exit(0);
            }


        }
    }





}

