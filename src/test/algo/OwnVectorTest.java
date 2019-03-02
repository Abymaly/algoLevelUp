package test.algo;

import ap.algo.OwnVector;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class OwnVectorTest {

    OwnVector<String> testVector;

    @Before
    public void before() {
        testVector = new OwnVector();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSizeAddOne() {
        Assert.assertEquals(0, testVector.size());
        testVector.add("test");
        Assert.assertEquals(1, testVector.size());
    }

    @Test
    public void testSizeAddInLoop() {
        Assert.assertEquals(0, testVector.size());
        for (int i = 0; i < 120; ++i) {
            testVector.add("test");
        }
        Assert.assertEquals(120, testVector.size());
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(testVector.isEmpty());
        testVector.add("test");
        Assert.assertFalse(testVector.isEmpty());
    }

    @Test
    public void testContains() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testIterator() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testToArray() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testAddO() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testRemoveO() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testAddAllC() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testAddAllForIndexC() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testClear() throws Exception {
//TODO: Test goes here... 
    }


    @Test
    public void testGet() {
        for (int i = 0; i < 10; ++i) {
            testVector.add("test" + i);
        }

        for (int i = 0; i < 10; ++i) {
            Assert.assertEquals("test" + i, testVector.get(i));
        }
    }

    @Test
    public void testSet() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testAddForIndexElement() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testRemoveIndex() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testIndexOf() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testLastIndexOf() {
        testVector.add("test");
        for (int i = 0; i < 10; ++i) {
            testVector.add("empty");
        }
        testVector.add("test");
        Assert.assertEquals(10, testVector.lastIndexOf("empty"));
        Assert.assertEquals(11, testVector.lastIndexOf("test"));
    }

    @Test
    public void testListIterator() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testListIteratorIndex() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testSubList() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testRetainAll() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testRemoveAll() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testContainsAll() throws Exception {
//TODO: Test goes here... 
    }

    @Test
    public void testToArrayA() throws Exception {
//TODO: Test goes here... 
    }

} 
