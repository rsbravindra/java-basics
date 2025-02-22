package com.learnig.basics.collections.queueex;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(41);
        queue.add(12);
        queue.add(33);
        queue.add(14);
        queue.add(12);
        System.out.println("Queue "+ queue);

        System.out.println("Queue after peek "+ queue.peek());

        System.out.println("Queue after remove "+ queue.remove());

        System.out.println("Queue after poll "+ queue.poll());

        System.out.println("Queue after poll "+ queue.poll());

        System.out.println("Queue after poll "+ queue.poll());

        System.out.println("Queue after poll "+ queue.poll());

        System.out.println("Queue after peek "+ queue.size());


        System.out.println("Stream " + Arrays.toString(queue.stream().toArray()));

        System.out.println("========================");

        Queue<String> queue1 = new PriorityQueue<>();
        queue1.add("Ravi");
        queue1.add("Sachin");
        queue1.add("Virat");
        queue1.add("Dhoni");
        queue1.add("Pandya");
        System.out.println("Priority Queue "+ queue1);

        queue1.poll();
        System.out.println("Priority Queue after poll "+ queue1);

        queue1.remove();
        System.out.println("Priority Queue after remove "+ queue1);

        System.out.println("Priority Queue after peek "+ queue1.peek());

        System.out.println("Priority Queue after element "+ queue1.element());

        System.out.println("Priority Blocking Queue");

        Queue<Integer> pbQueue = new LinkedList<>();
        pbQueue.add(1);
        pbQueue.add(2);
        pbQueue.add(3);
        pbQueue.add(4);
        pbQueue.add(5);

        System.out.println(pbQueue.peek());

        System.out.println(pbQueue.poll());

        System.out.println(pbQueue.peek());


        Queue<Integer> concurrentQueue = new ConcurrentLinkedQueue<>();
        concurrentQueue.add(1);
        concurrentQueue.add(2);
        concurrentQueue.add(3);
        concurrentQueue.add(4);
        concurrentQueue.add(5);
        System.out.println(concurrentQueue);

        System.out.println(concurrentQueue.peek());
        System.out.println(concurrentQueue.add(3));
        System.out.println(concurrentQueue.remove());


        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        System.out.println(deque);
        deque.addAll(concurrentQueue);
        System.out.println(deque);

        Set<Integer> items = new HashSet<>();

        Stream<Integer> stream = deque.stream();
//        System.out.println(Arrays.toString(stream.filter(items::add).toArray()));

        System.out.println(stream.filter(n-> !items.add(n)).collect(Collectors.toSet()));

    }
}
