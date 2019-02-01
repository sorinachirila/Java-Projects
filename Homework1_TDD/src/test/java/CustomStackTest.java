import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class CustomStackTest {

    private CustomStack customStack;


    @Before
    public void initCustomStack() {
        customStack = new CustomStack();
    }

    @Test
    public void testWhenAStackIsEmptyMethodReturnsTrue() {
        assertTrue(customStack.isEmpty());

    }
    @Test
    public void testWhenAStackHasAnElementIsEmptyMethodReturnsFalse(){
        customStack.push(new Integer(1));
        assertFalse(customStack.isEmpty());
    }

    @Test
    public void testWhenAnEmptyStackIsUsedThenSizeMethodReturnsZero(){
        assertEquals(0, customStack.size());
    }
    @Test
    public void testWhenAnElementIsAddedToAnEmptyStackSizeMethodReturnsOne(){
        customStack.push(new Integer(24));
        assertEquals(1, customStack.size());
    }
    @Test
    public void testWhenTwoElementsAreAddedToAnEmptyStackSizeMethodReturnsTwo(){
        customStack.push(new Integer(24));
        customStack.push(new Integer(24));
        assertEquals(2, customStack.size());
    }

    @Test
    public void testWhenAStackHasTwoElementsIsEmptyMethodReturnsFalse(){
        customStack.push(new Integer(1));
        customStack.push(new Integer(3));
        assertFalse(customStack.isEmpty());
    }

    @Test(expected = RuntimeException.class)
    public void testWhenAStackIsEmptyPeekMethodThrowsARuntimeException(){
       // System.out.println("testRuntimeExceptionPeek");
            customStack.peek();
    }

    @Test
    public void testWhenAStackHasAnElementPeekMethodReturnsThatElement(){
        customStack.push(new Integer(10));
        assertThat(customStack.peek(), is(new Integer(10)));
        assertThat(customStack.size(), is(1));
    }
    @Test
    public void testWhenAStackHasTwoElementsPeekMethodReturnsLastAddedElement(){
        customStack.push(new Integer(10));
        customStack.push(new Integer(11));
        assertThat(customStack.peek(), is(new Integer(11)));
        assertThat(customStack.size(), is(2));
    }

    @Test(expected = RuntimeException.class)
    public void testWhenAStackIsEmptyPopMethodThrowsARuntimeException(){
        //System.out.println("testRuntimeExceptionPop");
        customStack.pop();
    }

    @Test
    public void testWhenAStackHasAnElementPopMethodReturnsThatElementAndRemovesItFromStack(){
        customStack.push(new Integer(20));
       // customStack.pop();
        assertThat(customStack.pop(), is(new Integer(20)));
        assertTrue(customStack.isEmpty());
        assertThat(customStack.size(), is(new Integer(0)));
    }
    @Test
    public void testWhenAStackHasTwoElementsPopMethodReturnsLastAddedElementAndRemovesItFromStack(){
        customStack.push(new Integer(20));
        customStack.push(new Integer(23));
        // customStack.pop();
        assertThat(customStack.pop(), is(new Integer(23)));
        assertFalse(customStack.isEmpty()); //am testat si faptul ca stiva nu este empty,
        assertThat(customStack.size(), is(1));//dar si ca size-ul sau este 1 !!! Probabil trebuia un singur assert per method!!
    }
    @Test
    public void testWhenAStackIsEmptyPushMethodAddsAnElementAndReturnsItFromStack(){
        //customStack.push(33);
        assertThat(customStack.push(new Integer(33)), is(new Integer(33)));
        assertFalse(customStack.isEmpty());

    }
    @Test
    public void testWhenAStackHasAnElementPushMethodAddsSecondElementAndReturnsItFromStack(){
        customStack.push(new Integer(10));
        //customStack.push(31); ????? nu prea stiu cum sa testez aici
        assertThat(customStack.push(new Integer(33)), is(new Integer(33)));
        assertFalse(customStack.isEmpty());

    }

    @Test(expected = RuntimeException.class)
    public void testWhenAStackIsEmptySearchMethodThrowsARuntimeException(){
        //System.out.println("testRuntimeExceptionSearch");
        customStack.search(new Integer(2));
    }

    @Test
    public void testWhenAStackHasAnElementSearchMethodReturnsFirstPositionIfFound(){
        customStack.push(new Integer(2));
        assertThat(customStack.search(new Integer(2)), is(0));
    }
    @Test
    public void testWhenAStackHasTwoElementsSearchMethodReturnsPositionIfFound(){
        customStack.push(new Integer(2));
        customStack.push(new Integer(7));
        assertThat(customStack.search(new Integer(7)), is(1));
    }
    @Test
    public void testWhenAStackHasAnElementSearchMethodReturnsNegativeOneIfNotFound(){
        customStack.push(new Integer(2));
        assertThat(customStack.search(new Integer(7)), is(-1));
    }
















}
