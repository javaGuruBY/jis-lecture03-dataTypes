package by.jrr.jis.lecture03.datatypes;

import org.junit.Test;

import static org.junit.Assert.*;

public class WrappersTest {

    @Test
    public void createWrapperWithConstructor() {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer("10");
        boolean equal = (i1 == i2);
        assertEquals(false, equal);
    }


    @Test
    public void createWrapperWithValueOf() {
        Integer i1 =  Integer.valueOf(10);
        Integer i2 =  Integer.valueOf("10");
        boolean equal = (i1 == i2);
        assertEquals(true, equal);

    }
    @Test
    public void createWrapperWithAutoboxing() {
        Integer i1 = 10;
        Integer i2 = 10;
        boolean equal = (i1 == i2);
        assertEquals(true, equal);
    }

    @Test
    public void newWrappersFromCache() {
        Integer i1 =  127;
        Integer i2 =  127;
        boolean equal = (i1 == i2);
        assertEquals(true, equal);
    }

    @Test
    public void newWrappersNonCache() {
        Integer i1 =  129;
        Integer i2 =  129;
        boolean equal = (i1 == i2);
        assertEquals(false, equal);
    }

    @Test
    public void createBooleanWrapper() {
        Boolean my1Bool = new Boolean(true);
        Boolean my2Bool = new Boolean("truee");
        Boolean my3Bool = new Boolean(null);
    }
    @Test
    public void createCharacterWrapper() {
        Character myChar = Character.valueOf('\u007f');
    }

    @Test
    public void unboxing() {
        Integer i1 =  1_000_000;
        int i = i1.intValue();
        short s = i1.shortValue();
        int primeInt = i1;
    }

    @Test
    public void maxAndMin() {
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short.SIZE = " + Short.SIZE);
        System.out.println("Short.BYTES = " + Short.BYTES);
    }

}
