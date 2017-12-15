/** Test SuperArray features
 *  work by Mr. Brown Mykolyk, used with thanks
 *  
 */

public class UserOfSuperArray {

    public static void main( String[] args ) {
        SuperArray curtis = new SuperArray();
         System.out.println( "Printing empty SuperArray curtis..." );
         System.out.println( curtis );

         // populate the sample array
         for( int i = 0; i < curtis.size(); i++ ) {
             curtis.set( i, i * 2 );
         }
         System.out.println("Printing populated SuperArray curtis...");
         System.out.println(curtis);

         // test expansion
         for( int i = 0; i < 3; i++ ) {
             curtis.expand();
             System.out.println("Printing expanded SuperArray curtis...");
             System.out.println(curtis);
         }
    }//end main()
}
