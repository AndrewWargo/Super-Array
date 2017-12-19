/**
  SuperArray implements list data and operations
  by encapsulating an array
 
  based on work by Mr. Brown Mykolyk and others at csStuy
 */

public class SuperArray {

    private int[] _data;  // underlying container
    private int filledElements;    // the number of elements in this list

    private final int INITIAL_CAPACITY = 10;

    /** 
      default constructor
      Constructs an empty list with an initial capacity of ten.
     */
    public SuperArray() {
        _data = new int[ INITIAL_CAPACITY];
        // filledElements 0 is already correct
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /** 
       @return a string representation of this list, in [a,b,c,] format
      */ 
    public String toString() {
        String result = "[";
        for( int i = 0; i < filledElements; i++)
            result += _data[ i] + ",";
        return result + "]";
    }


    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
         // expand if necessary
         if( filledElements == _data.length) expand();

         _data[ filledElements] = value;
         filledElements++;
         // idiomatic version: _data[ filledElements++] = value;
        return true;
     }


    /** 
      Inserts @value at position @index in this list.
      
      Shifts the element currently at that position (if any) and any
      subsequent elements to the right (adds one to their indexes).
     */
      public void add( int index, int value) {
    	  if(filledElements + 1 > _data.length) {
    		  expand();
    	  }
    	  for(int position = filledElements; position > index; position--) {
    		_data[position] = _data[position - 1];  
    	  }
    	  _data[index] = value;
    	  filledElements++;
      }


    /** 
      Doubles the capacity of the SuperArray, 
      preserving existing data
     */
     private void expand() {
        System.out.println( "expand... (for debugging)"); /* comment out eventually
           Working methods should be silent. But during development, the programmer
           must verify that this method is called when that is appropriate. 
           S.O.P. rules for debugging.
           */
        int[] bigger = new int[ _data.length * 2];
        for( int i = 0; i < filledElements; i++)
            bigger[i] = _data[i];
        _data = bigger;
     }

     
    /** 
      accessor  
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
    public int get( int index ) {
        // E-Z! pass through the request
        return _data[ index];
    }


    /** 
      Set value at @index to @newValue
      
      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
    public int set( int index, int newValue ) {
        int saveForReturn = get( index);
        _data[ index] = newValue;
        return saveForReturn;
    }

    /** 
      Removes the element at the specified position in this list.
      Shifts any subsequent elements to the left (that is, 
      subtracts one from their indexes).
      
      @return the value that was removed from the list
     */
      public int remove( int index) {
    	  int x = _data[index];
    	  for(int position = index; position < filledElements; position++) {
    		  _data[position] = _data[position + 1];
    	  }
    	  filledElements--;
    	  return x;
      }


    
}