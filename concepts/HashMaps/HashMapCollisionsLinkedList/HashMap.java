/**
* HashMap Class
* @author Christoph Schild
* 
*/
public class HashMap {

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
    /**
    * Debug method that displays entire HashMap
    */
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
    /**
    * Adds new data to hashmap
    * @param data new data to be added to HashMap
    */
    public void add(String data) {
        int hash = hash(data);
        if(map[hash].add(data)) count++;

    }
    /**
    * Removes element from HashMap
    * @param data new data to be removed from HashMap
    */
    public void remove(String data) {
        int hash = hash(data);
        map[hash].remove(data);
        count--;
    }
    /**
    * Retrieves data from HashMap
    * @param data new data to be searched for
    * @return element searched for
    */
    public String get(String data) {
        return "";
    }
    /**
    * Performs hash operation to determine where new data should be added
    * @param value value to be hashed
    * @return hash integer
    */
    private int hash(String value) {
        int charSum = 0;
        for(char thisChar : value.toCharArray()) {
            charSum += Character.getNumericValue(thisChar);
        }
        return charSum % size;
    }
    /**
    * Resizes HashMap to accomodate new size
    */
    public void resize() {
        
    }
}