class LinkedList {
    Node head = new Node();
    int length = 0;
    Boolean isSet;
    LinkedList(Boolean __isSet) {
        isSet = __isSet;
    }
    public Boolean push(String data) {
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
    public void remove(String data) {
        length--;
    }
}