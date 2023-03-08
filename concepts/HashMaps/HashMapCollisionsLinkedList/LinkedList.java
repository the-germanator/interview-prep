/**
* LinkedList Class that stores HashMap values with the same hash (collisions)
* @author Christoph Schild
*/
public class LinkedList {
    Node head = new Node();
    int length = 0;
    Boolean isSet;
    LinkedList(Boolean __isSet) {
        isSet = __isSet;
    }
    /**
    * Pushes new value into Linked List
    * @param data String to be added to LinkedList
    * @return success of insert (should only fail if SET mode enabled)
    */
    public Boolean add(String data) {
        Boolean dup = false;
        if(length == 0) {
            head = new Node(data);
            length++;
            return true;
        } else {
            Node temp = head;
            while(temp.next != null && (!dup || !isSet)) {
                temp = temp.next;
                if(temp.value == data) dup = true;
            }
            if(!isSet || !dup) {
                temp.next = new Node(data);
                length++;
                return true;
            } 
            return false;
            
        }
    }
    /**
    * Removes element from Linked List
    * @param data String to be added to LinkedList
    */
    public Boolean remove(String data) {
        if(head.next == null) {
            if(head.value == data) {
                head = new Node();
                length--;
                return true;
            }
        }




        System.out.println("Deleting " + data);
        Node temp = head;
        if(temp.value == data) {
            System.out.println("HERE");
            if(temp.next != null) {
                System.out.println(data + " is NOT last");
                head = temp.next;
                length--;
                return true;
            } else {
                System.out.println(data + " IS last");
                head = new Node();
                return true;
            }
        }
        // Not first elem.
        while(temp.next != null) {
            if(temp.next.value == data) {
                if(temp.next.next != null) {
                    temp.next = temp.next.next;
                    length--;
                    return true;
                }
                temp.next = null;
                length--;
                return true;
            }
        }
        return false;
    }
}