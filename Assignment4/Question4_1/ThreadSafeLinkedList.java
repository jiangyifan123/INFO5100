package Question4_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeLinkedList<E> {
    private LinkedList<E> list = new LinkedList<>();

    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void add(E e) {
        lock.writeLock().lock();
        list.add(e);
        lock.writeLock().unlock();
    }

    public void addAtPosition(int index, E e) {
        lock.writeLock().lock();
        list.add(index, e);
        lock.writeLock().unlock();
    }

    public void removeAtPosition(int index, E e){
        lock.writeLock().lock();
        if(this.get(index).equals(e))
            list.remove(index);
        lock.writeLock().unlock();
    }

    public E get(int index) {
        E e;
        lock.readLock().lock();
        e = list.get(index);
        lock.readLock().unlock();
        return e;
    }

    public E getFirst() {
        E e;
        lock.readLock().lock();
        e = list.getFirst();
        lock.readLock().unlock();
        return e;
    }

    public E getLast() {
        E e;
        lock.readLock().lock();
        e = list.getLast();
        lock.readLock().unlock();
        return e;
    }

    public int size() {
        int size;
        lock.readLock().lock();
        size = list.size();
        lock.readLock().unlock();
        return size;

    }

    public void printlist(){
        list.printlist();
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ThreadSafeLinkedList threadSafeLinkedList = new ThreadSafeLinkedList<>();
        for(int i=0;i<10;i++) {
            service.submit(new Worker(threadSafeLinkedList, i));
        }
        service.shutdown();
        try {
            service.awaitTermination(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadSafeLinkedList.size());
        threadSafeLinkedList.printlist();
    }

    static private class LinkedList<E>{
        private int size = 0;
        private Node head, tail;

        public LinkedList(){
            this.size = 0;
            this.head = null;
            this.tail = null;
        }

        public boolean add(E e){
            if(this.tail == null){
                this.tail = new Node(e);
                this.head = this.tail;
            }
            else{
                this.tail.next = new Node(e);
                this.tail = this.tail.next;
            }
            this.size++;
            return true;
        }

        public void add(int index, E e){
            if(this.size() < index)
                return;
            if(this.size() == index)
                this.add(e);
            else{
                Node pos = this.head;
                for(int i = 0; i < index-1 && pos != null; i++, pos = pos.next);
                if(pos == null)
                    return;
                Node newNode = new Node(e);
                newNode.next = pos.next;
                pos.next = newNode;
                this.size++;
            }
        }

        public int size(){
            return this.size;
        }

        public boolean empty(){
            return this.size <= 0;
        }

        public E getFirst(){
            if(!this.empty() && this.head != null)
                return (E)this.head.data;
            return null;
        }

        public E getLast(){
            if(!this.empty() && this.tail != null)
                return (E)this.tail.data;
            return null;
        }

        public E get(int index){
            if(index >= 0 && this.size() > index){
                Node pos = this.head;
                for(int i = 0; i < index && pos != null; i++, pos = pos.next);
                if(pos != null)
                    return (E)pos.data;
            }
            return null;
        }

        public E remove(int index){
            if(index >= 0 && this.size() > index){
                E val = null;
                if(index == 0){
                    val = (E)this.head.data;
                    this.head = this.head.next;
                }
                else{
                    Node pos = this.head;
                    for(int i = 0; i < index-1 && pos != null; i++, pos = pos.next);
                    if(pos != null && pos.next != null){
                        val = (E)pos.next.data;
                        pos.next = pos.next.next;
                    }
                }
                this.size--;
                if(this.head == null)
                    this.tail = null;
                return val;
            }
            return null;
        }

        public void printlist(){
            if(this.empty() || this.head == null)
                return;
            for(Node pos = this.head; pos != null; pos = pos.next){
                System.out.print((E)pos.data + " ");
            }
            System.out.println();
        }
    }

    static private class Node{
        public Object data;
        public Node next;

        public Node(Object data){
            this.data = data;
            this.next = null;
        }

        public Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    static class Worker<E> implements Runnable{

        ThreadSafeLinkedList<E> list;
        E value;

        public Worker(ThreadSafeLinkedList<E> list, E i) {
            this.list = list;
            this.value = i;
        }

        @Override
        public void run() {
            for(int i=0;i<1000;i++) {
                list.add(value);
            }
        }
    }
}