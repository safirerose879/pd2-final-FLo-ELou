public class Node<Cards> {

    private Cards data;
    private Cards next;

    public Node(Cards d) {
	data = d;
	next = null;
    }

    public void setData(Cards d) {
	data = d;
    }
    public Cards getData() {
	return data;
    }
    public String getName(){
	return data.getName();
    }
    public void setNext(Cards n){
	next = n;
    }
    public Node getNext() {
	return next;
    }
    public String toString() {
	return ""+data;
    }

}
