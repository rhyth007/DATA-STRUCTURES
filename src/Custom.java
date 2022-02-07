import java.util.*;

public class Custom {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(48);
        stack.push(54);
        stack.push(84);
        stack.push(94);
        stack.push(55);
        System.out.println("---------------------------STACK----------------------");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("---------------------------QUEUE----------------------");

        Queue<Integer>queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(8);
        queue.add(11);
        queue.add(13);
        queue.add(21);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println("---------------------------DEQUE----------------------");

        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.add(3);
        dequeue.addFirst(5);
        dequeue.addLast(8);
        dequeue.add(11);
        dequeue.add(13);
        dequeue.add(21);
        System.out.println(dequeue.remove());
        System.out.println(dequeue.removeFirst());
        System.out.println(dequeue.removeLast());
        System.out.println(dequeue);

    }
}
