package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public  ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {


        ArrayDeque<Integer>arrayDeque=new ArrayDeque<>();

        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(secondQueue.remove());
        arrayDeque.add(secondQueue.remove());


        for (int i = 0; i < arrayDeque.size(); i++) {
            try {

                firstQueue.add(arrayDeque.getLast());
                arrayDeque.removeLast();
                arrayDeque.add(firstQueue.remove());
                arrayDeque.add(firstQueue.remove());

                secondQueue.add(arrayDeque.getLast());
                arrayDeque.removeLast();
                arrayDeque.add(secondQueue.remove());
                arrayDeque.add(secondQueue.remove());



            }catch (Exception ex){
                break;
            }
        }

        return arrayDeque;


    }
}
