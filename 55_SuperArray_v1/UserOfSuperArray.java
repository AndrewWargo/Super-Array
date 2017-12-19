/** 
 * Test SuperArray features for implementing a list.
 */

public class UserOfSuperArray {

    public static void main( String[] args ) {
        // --------- code that worked in hw54 ---------
        SuperArray list = new SuperArray();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list:" + list);

        // Populate the list.
        int i = 0;
        for( ; i < 8; i++ ) {
            list.add( -i); // differs from index, but similar
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("initial population of " + list.size() + " elements:");
        System.out.println( list);
        // --------- end of "code that worked in hw54" ---------

         // add to the middle of a small list
         list.add( 2, 17);
         System.out.println("insert 17, -->" + list.size() + " elements:");
         System.out.println( list);
        
         // force an expansion
         list.add( 2, 19);
         System.out.println("insert 19, -->" + list.size() + " elements:");
         System.out.println( list);
         list.add( 2, 23);
         System.out.println("insert 23, -->" + list.size() + " elements:");
         System.out.println( list);

         // remove value
         System.out.println("removing value " + list.remove( 6)
                           + ", leaving " + list.size() + " elements:");
         System.out.println( list);
         System.out.println( "expecting:");
         System.out.println( "[0,-1,23,19,17,-2,-4,-5,-6,-7,]");
    }
}