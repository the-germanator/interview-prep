
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println(modulo(25,2));

    }
    public static int modulo(int num, int mod) {
        if(num >= mod) return modulo(num - mod, mod);
        return num;
    }
}
