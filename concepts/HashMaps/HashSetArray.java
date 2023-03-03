class HashSetArray {
    public static void main(String[] args) {
        HashSet test = new HashSet();
        test.add(1000);
        test.add(900);
        test.add(800);
        test.add(700);
        test.add(600);
        test.add(500);
        test.add(500);
        test.add(400);
        test.add(300);
        test.add(200);
        test.add(100);
        test.add(500);
        test.add(400);
        test.add(300);
        test.add(200);
        test.add(100);
        test.remove(1000);
        test.remove(1000);
        test.display();
    }
}


class HashSet {
    int[] set = new int[2];
    int fill = 0;

    public HashSet() {

    }

    public void add(int key) {
        if(!contains(key)) {
            if(fill >= set.length) {
                resizeMap();
            }
            fill++;
            set[fill-1] = key;
        }
    }
    
    public void remove(int key) {
        if(contains(key)) {
            int idx = 0;
            while(idx < fill && set[idx] != key) {
                idx++;
            }
            for(int j = idx; j < fill - 1; j++) {
                set[j] = set[j+1];
            }
            fill--;
        }
    }
    
    public boolean contains(int key) {
       for(int i = 0 ; i < fill; i++) {
           if(set[i] == key) return true;
       }
       return false;
    }

    private void resizeMap() {
        int[] temp = set;
        set = new int[set.length * 2];
        for(int i = 0; i < fill; i++) {
            set[i] = temp[i];
        }
    }
    public void display() {
        System.out.println("Set Size: " + set.length);
        System.out.println("Number of elements: " + fill);
        System.out.println("Utilization Percentage: " + (double)((double)fill / (double)set.length) * 100);
        System.out.println("Elements:");
        for(int idx = 0 ; idx < fill; idx++) {
            System.out.print(set[idx] + ", ");
        }
        System.out.println("");
        
    }
}