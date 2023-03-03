/**
* Main Class contains the driver coce for example code
* @author Christoph Schild
* 
*/

public class Main {
    /**
    * Main entry point to the HashMap/HashSet example code
    * @param args Standard command line arguments
    */
    public static void main(String[] args) {
        HashMap test = new HashMap(4, false);
        test.push("Gilfoyle");
        test.push("Dinesh");
        test.push("Richard");
        test.push("Monica");
        test.push("Lori");
        test.push("Big Head");
        test.push("Erlich");
        test.push("Gavin");
        test.push("Jin Yang");
        test.push("Peter");
        
        
        test.debug();
    }

}