class HashMap {

    public int count = 0;
    private int size = 0;
    private LinkedList[] map;

    HashMap(int __size, Boolean isSet) {
        size = __size;
        map = new LinkedList[size];
        for(int i = 0; i < size; i++) {
            map[i] = new LinkedList(isSet);
        }
    }
    public void debug() {
        System.out.println("----------------\nSize: " + size + ", Count: " + count + "");
        for(int i = 0; i < map.length; i++) {
            System.out.print("Index [" + i + "]: ");
            LinkedList tempLL = map[i];
            Node tempNode = tempLL.head;
            while(tempNode.next != null) {
                System.out.print("[" + tempNode.value + "]" + "-->");
                tempNode = tempNode.next;
            }
            System.out.println("[" + tempNode.value + "]");
        }
        System.out.println("");
    }
    public void push(String data) {
        int hash = hash(data);
        if(map[hash].push(data)) count++;

    }
    public void remove(String data) {
        
    }
    public void get(String data) {
        
    }
    private int hash(String value) {
        int charSum = 0;
        for(char thisChar : value.toCharArray()) {
            charSum += Character.getNumericValue(thisChar);
        }
        return charSum % size;
    }
    public void resize() {
        
    }
}