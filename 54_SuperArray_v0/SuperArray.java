/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 *
 * skeleton by Mr. Brown Mykolyk
 ***************************/

public class SuperArray {

    private int[] _data;  // underlying container
    private int _size;    // the number of elements in the list

    /** 
      default constructor
      Constructs an empty list with an initial capacity of ten.
     */
    public SuperArray() {
        _data = new int[10];
        _size = 0;
   }


    /** 
      @return the number of elements in this list
     */
     public int size() {
     	return _size; 
     }


     /** 
       @return a string representation of the list, in [a,b,c,] format
      */ 
     public String toString() {
    		String x = "[";                        
    		for(int i = 0; i < _size; i++){  
    		    x = x + _data[i] + ",";
    		}
    		return x + "]";
     }


    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
      public boolean add( int value) {
    	  if(_size == _data.length) {
    		  expand();
    	  }
    	  _data[_size] = value;
    	  _size++;
    	  return true;
      }


    /** 
      Doubles the capacity of the SuperArray, 
      preserving extant data
     */
      private void expand() {
          int[] x = new int[_size * 2]; //Constructs a reference to a new array  with double the length of _data
          for(int i = 0; i < _size; i++) { 
  	    x[i] = _data[i]; //Adds the values in _data to the new array, in the same position as data
          }
          _data = x; //Sets _data to the array referenced by x, which is itself _data with double the length
         
      }

     
    /** 
      accessor  
      @return element @index from the list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
     public int get( int index ) {
         return _data[index];
     }


    /** 
      Set value at @index to @newValue
      
      @return old value at @index
      @precondition: @index is within the bounds of the list.
     */
     public int set( int index, int newValue ) {
         int y = get(index); //Sets int y to the value held in _data[index] MUST BE FIRST, otherwise the function would return the new value
         _data[index] = newValue; //Sets the value held in _data[index] to the new value
         return y; //Returns the old value
     }
}//end of class

