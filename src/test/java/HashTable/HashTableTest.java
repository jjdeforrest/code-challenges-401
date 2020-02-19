package HashTable;

import org.junit.Assert;
import org.junit.Test;

public class HashTableTest {

    @Test
    public void add() {
        HashTable joker;
        joker = new HashTable();
        joker.add("joker","bane");
        Assert.assertTrue(joker.contains("joker"));
    }

    @Test
    public void get() {
        HashTable joker;
        joker = new HashTable();
        joker.add("joker","bane");
        Assert.assertEquals("bane",joker.get("joker"));
    }

    @Test
    public void contains() {
        HashTable joker;
        joker = new HashTable();
        joker.add("TestContains","Test");
        Assert.assertTrue(joker.contains("TestContains"));
    }

    @Test
    public void testGetFail(){
        HashTable joker;
        joker = new HashTable();
        joker.add("TestContains","Test");
        Assert.assertNull(joker.get("joker"));
    }

    @Test
    public void testConflict(){
        HashTable joker;
        joker = new HashTable();
        joker.add("joker","joker");
        joker.add("bane","bane");
        Assert.assertEquals("joker",joker.get("joker"));
        Assert.assertEquals("bane",joker.get("bane"));
    }
}