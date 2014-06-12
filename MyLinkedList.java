import java.io.*;
import java.util.*;

public class MyLinkedList<E> implements Iterable<E>{

    private Node<E> head;

    public Iterator<E> iterator() {
	return new MyLLIterator<E>(head);
    }
    
    public MyLinkedList() {
	head = null;
    }
    
    public void add(E d) {
	Node<E> tmp = new Node<E>(d);
	tmp.setNext(head);
	head=tmp;

    }
    public String toString() {
	String s= "";
	return s;
    }

}