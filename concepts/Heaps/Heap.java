
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<Integer>();

        /* Setup */
        heap.add(null);
        heap.add(14);
        heap.add(19);
        heap.add(16);
        heap.add(21);
        heap.add(26);
        heap.add(19);
        heap.add(68);
        heap.add(65);
        heap.add(30);
        displayHeap(heap);
        // push(heap, 17);
        // displayHeap(heap);
        System.out.println("Popped " + pop(heap));
        displayHeap(heap);

    }
    public static void displayHeap(ArrayList<Integer> heap) {
        System.out.println("\n");
        for(int i = 0; i < heap.size(); i++) {
            System.out.println("[" + i + "]: " + heap.get(i));
        }
    }
    public static void push(ArrayList<Integer> heap, int val) {
        heap.add(val);
        
        int child = heap.size() - 1;
        int parent = child / 2;

        /* Percolate! */
        while(parent >= 1 && heap.get(parent) > heap.get(child)) {
            int temp = heap.get(parent);
            heap.set(parent, heap.get(child));
            heap.set(child, temp);
            child = parent;
            parent = child / 2;
        }
    }
    public static int pop(ArrayList<Integer> heap) {
       if(heap.size() <= 1) return -1;
       if(heap.size() == 2) return heap.remove(heap.size()-1);
       int res = heap.get(1);
       heap.set(1, heap.remove(heap.size()-1));

        int pp = 1;
        while(pp * 2 < heap.size()) {

            int parent = heap.get(pp);
            
            int lp = pp * 2;
            int lc = heap.get(lp);

            int rp = pp * 2 + 1;
            int rc = heap.get(rp);

            if(rp < heap.size() && rc < lc && parent > rc) {
                heap.set(pp, rc);
                heap.set(rp, parent);
                pp = rp;

            } else if(parent > lc) {
                heap.set(pp, lc);
                heap.set(lp, parent);
                pp = rp;
            }
            else {
                break;
            }
        }
        return res;
    }
}
