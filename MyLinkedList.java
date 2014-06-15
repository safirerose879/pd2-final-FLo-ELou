import java.io.*;
import java.util.*;

public class MyLinkedList<Cards> implements Iterable<Cards>{

    private Node<Cards> head;

    public Iterator<Cards> iterator() {
	return new MyLLIterator<Cards>(head);
    }
    
    public MyLinkedList() {
	head = null;
    }
    
    public void add(Cards d) {
	Node<Cards> tmp = new Node<Cards>(d);
	tmp.setNext(head);
	head=tmp;

    }
    public String toString() {
	String s= "";
	Node current = head;
	while (current !=null){
	    s += current.getData() + "\n";
	    current = current.getNext();
	}
	return s;
    }
    public Node<Cards> getHead(){
	return head;
    }

}
