public class Stack {
    private int[] data;
    private int top;
    private  int capacity;
    private static  final int DEFAULT_SIZE = 10;

    public Stack(int size){
     data = new int[size];
     capacity = size;
      top = -1;
     //this.data = new int[size];
    }
    public Stack(){
        this(DEFAULT_SIZE);
    }
    public boolean isFull(){
        return top== capacity-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void PrintStack(){
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i]+" ");
        }
    }

    public void push(int element){
        if(isFull()){
            System.out.println("..................STACK OVERFLOW...............");
            return;
        }
            data[++top] = element;


    }
    public  int peek(){
        return data[top];
    }
    public  int pop(){
        if(isEmpty())
            System.out.println("STACK IS EMPTY");

        return data[top--];
    }




    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.PrintStack();
        System.out.println();
        System.out.println("Peek : "+stack.peek());
        System.out.println("POPED ELEMENT IS : "+stack.pop());
        stack.PrintStack();
    }
}

/*
STACK : LIFO || FILO
 */