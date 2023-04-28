package org.diego;

import junit.framework.TestCase;
import org.junit.Test;

public class SListTest extends TestCase {

    @Test
    public void testSList() {
        SList sl = new SList();
        sl.prepend("a");
        sl.prepend("b");
        sl.prepend("c");
        assertEquals("a", sl.getLast());
        sl.removeLast();
        assertEquals("b", sl.getLast());
        sl.removeLast();
        assertEquals("c", sl.getLast());
    }

    @Test
    public void testReplace() {
        SList sl = new SList();
        sl.prepend("a");
        sl.prepend("b");
        sl.prepend("c");
        sl.replace("a", "z");
        //assertEquals("a", sl.getLast());

    }
}