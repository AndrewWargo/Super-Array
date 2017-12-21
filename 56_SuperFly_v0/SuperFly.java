
/**
  SuperFly encapsulates the implementation of a list of disparate types,
  programmed without polymorphism
 */
public class SuperFly {

    private int filledElements; // the number of elements in this list

    // underlying containers
    private int[]    intData;
    private double[] doubleData;
    private String[] StringData;
    
    // type identifier for each element
    private byte[] typeOfElement;

    private static final int INITIAL_CAPACITY = 10;


    /** 
      Constructs an empty list with an initial capacity of ten,
      and with no elements initially.
     */
    public SuperFly() {
	intData = new int[INITIAL_CAPACITY];
	doubleData = new double[INITIAL_CAPACITY];
	StringData = new String[INITIAL_CAPACITY];
	typeOfElement = new byte[INITIAL_CAPACITY];
	filledElements = 0;
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
	 String result = "[ ";
	 for(int i = 0; i < filledElements; i++){
	     int type = typeOfElement[i];
	     if(type == 0){
		 result += intData[i] + ", ";
	     } else if(type == 1) {
		 result += doubleData[i] + ", ";
	     } else {
		 result += StringData[i] + ", ";
	     }
	 }
	 return result + "]";
     }


    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int type
                       , int intValue
                       , double doubleValue
                       , String stringValue
                       ) {
    	 if(filledElements == typeOfElement.length)
    		 expand();
    	 typeOfElement[filledElements] = (byte)type;
    	 if(type == 0){
    		 intData[filledElements] = intValue;
    	 } else if(type == 1) {
    		 doubleData[filledElements] = doubleValue;
    	 } else {
    		 StringData[filledElements] = stringValue;
    	 }
    	 filledElements++;
    	 return true;
     }


    /** 
      Doubles the capacity of the SuperFly, 
      preserving existing data
     */
      private void expand() {
         int[] newIntData = new int[intData.length * 2];
         double[] newDoubleData = new double[doubleData.length * 2];
         String[] newStringData = new String[StringData.length * 2];
         byte[] newTypeOfElement = new byte[typeOfElement.length * 2];
         for(int i = 0; i < filledElements; i++) {
        	 newIntData[i] = intData[i];
        	 newDoubleData[i] = doubleData[i];
        	 newStringData[i] = StringData[i];
        	 newTypeOfElement[i] = typeOfElement[i];
         }
         intData = newIntData;
         doubleData = newDoubleData;
         StringData = newStringData;
         typeOfElement = newTypeOfElement;
      }
}
