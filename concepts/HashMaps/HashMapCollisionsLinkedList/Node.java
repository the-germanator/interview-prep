/**
* Node Class: Linked List Nodes
* @author Christoph Schild
* 
*/
public class Node {
    public String value;
    public Node next = null;
    Node(String data) {
        value = data;
    }
    Node() {
        value = null;
    }
}