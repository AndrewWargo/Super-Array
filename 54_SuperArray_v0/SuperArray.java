/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 *
 * skeleton by Mr. Brown Mykolyk
 ***************************/

public class SuperArray {

    private int[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray() {
        _data = new int[10];
        _size = _data.length;
    }

    //returns length of _data
    public int getLength() {
    	return _size;          
    }


    // represents SuperArray in [a,b,c] format
    public String toString() {
	String x = "[";                        
	for(int i = 0; i < _data.length; i++){  
	    x = x + _data[i] + ",";
	}
	return x + "]";
    }


    //doubles the capacity of SuperArray
    public void expand() {
        int[] x = new int[_size * 2]; //Constructs a reference to a new array  with double the length of _data
        for(int i = 0; i < _size; i++) { 
	    x[i] = _data[i]; //Adds the values in _data to the new array, in the same position as data
        }
        _data = x; //Sets _data to the array referenced by x, which is itself _data with double the length
        _size = _data.length; //Sets the size variable to the length of the new array
    }


    //accessor -- returns value at specified index
    public int get( int index ) {
        return _data[index];
    }


    //mutator -- sets value at index to newVal,
    //           return old value at index
    public int set( int index, int newVal ) { 
        int y = get(index); //Sets int y to the value held in _data[index] MUST BE FIRST, otherwise the function would return the new value
        _data[index] = newVal; //Sets the value held in _data[index] to the new value
        return y; //Returns the old value
    }
}//end class

