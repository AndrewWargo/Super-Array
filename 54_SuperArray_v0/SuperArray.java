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
    
    public int getLength() {
    	return _size;
    }


    // represent SuperArray in [a,b,c] format
    public String toString() {
	String x = "[";
	for(int i = 0; i < _data.length; i++){
	    x = x + _data[i] + ",";
	}
	return x + "]";
    }


    //double the capacity of SuperArray
    public void expand() {
        int[] x = new int[_size * 2];
        for(int i = 0; i < _size; i++) {
        	x[i] = _data[i];
        }
        _data = x;
        _size = _size * 2;
    }


    //accessor -- return value at specified index
    public int get( int index ) {
        return _data[index];
    }


    //mutator -- set value at index to newVal,
    //           return old value at index
    public int set( int index, int newVal ) {
        int y = get(index);
        _data[index] = newVal;
        return y;
    }
}//end class

