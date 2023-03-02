import java.util.*;

class SimpleHashMap {
    public static void main(String[] args) {
        HashMap test = new HashMap();

        System.out.println(test.get(100));
        System.out.println(test.get(200));
        System.out.println();

        test.put(100, 200);
        test.put(200, 100);

        System.out.println(test.get(100));
        System.out.println(test.get(200));
        System.out.println();

        test.remove(100);
        System.out.println(test.get(100));
        System.out.println(test.get(200));
        System.out.println();
    }
}

class HashMap {
    private int[] hashMap = new int[10000001];

    public HashMap() {
        Arrays.fill(hashMap,-1);
    }
    public void put(int key, int value) {
        hashMap[key] = value;
    }
    public int get(int key) {
        return hashMap[key];
    }
    public void remove(int key) {
        hashMap[key] = -1;
    }
}