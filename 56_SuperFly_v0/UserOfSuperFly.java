/** 
 * Test SuperFly
 */
public class UserOfSuperFly {

    public static void main( String[] args ) {
        SuperFly list = new SuperFly();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list:" + list);

        // Populate the list with diverse elements.
        list.add( 2, -1, -2.0,  "important");
        list.add( 0, 17, -2.0,  "junk");
        list.add( 1, -1, 1.618, "junk");

        System.out.println("initial population of " + list.size() + " elements:");
        System.out.println( list);
        
        // // Add enough elements that expansion is expected
        // for( int i = list.size(); i < 15; i++ ) {
            
            // if( i == 10) System.out.println( "expansion expected");
            
            // list.add( 0, -i, -2.0,  "junk");
            // System.out.println( "number of elements: " + list.size() );
        // }
        // System.out.println("result of expanded list: " + list.size() + " elements:");
        // System.out.println( list);
    }
}
