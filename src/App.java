public class App{
    public static void main(String[] args){
        //Main method//
        //Primitive data types-stored in stack-easily accessible//
        //Values are stored in variables//
        //integer,char, boolean, byte//
        int intNum = 10;
        Integer integerRef = 10;   // Integer is a class referenced - USe ctrl+left mouse click//
        integerRef.shortValue();   // Classes have methods//
        short shortNum = 32767;
        Short shortRef = 32767;
        long longNum= 3713923L;  // Needs L//
        Long longNumRef = 3713923L;
        float floatNum= 45.6f;   //Needs f in the end//
        char charChar = 'a';
        Character charRef = 'a';
        boolean booleanValue = true;
        byte myByte = 120;


        // Reference data bytes-stored in heap//
        //Stored in location of values in the memory address//
        // Integer 128bits Vs Int occupies 32 bits of data-this is used in optimizing)
        System.out.println(intNum);
        System.out.println(integerRef);
    }

}
