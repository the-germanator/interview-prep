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
        test.add("Gilfoyle");
        test.add("Dinesh");
        test.add("Richard");
        test.add("Monica");
        test.add("Lori");
        test.add("Big Head");
        test.add("Erlich");
        test.add("Gavin");
        test.add("Jin Yang");
        test.add("Peter");
        test.debug();

       
        test.remove("Dinesh");
         test.remove("Erlich");
        test.remove("Richard");
        test.remove("Monica");
        test.remove("Peter");
        test.remove("Lori");
        test.remove("Big Head");
        test.remove("Gavin");
        test.remove("Jin Yang");
        test.remove("Gilfoyle");


        test.debug();
    }

}