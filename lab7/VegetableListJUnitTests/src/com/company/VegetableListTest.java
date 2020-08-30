package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class VegetableListTest {
   private VegetableList test;
   private VegetableList test1;
   private Tomato tomato= new Tomato(180,101,"Tomato");
   private Feta feta=new Feta(264,200,"Feta");
   private RedPepper redPepper=new RedPepper(20,110,"RedPepper");
   private Onion onion=new Onion(35,90,"Onion");
   private Cucumber cucumber=new Cucumber(16,100,"Cucumber");

    @BeforeEach
    void startVegList(){
    test=new VegetableList();
    test.add(tomato);
    test.add(feta);
    test.add(redPepper);
    test1=new VegetableList();
    }

    @AfterEach
    void endVegList(){
    test.clear();
    test1.clear();
    }

    @Test
    void size() {
       assertEquals(3, test.size());
       assertEquals(0, test1.size());
    }

    @Test
    void isEmpty() {
        assertFalse(test.isEmpty());
        assertTrue(test1.isEmpty());
    }

    @Test
    void contains() {
        Onion onion1=new Onion(1,1,"onion1");
        assertFalse(test1.contains(cucumber));
        assertFalse(test1.contains(onion1));
        assertFalse(test.contains(onion1));
        assertTrue(test.contains(tomato));
        test.add(onion1);
        assertTrue(test.contains(onion1));
    }

    @Test
    void iterator() {
        Iterator iterator = test.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            i++;
            iterator.next();
        }
        assertEquals(3, i);
        assertThrows(NoSuchElementException.class, () -> iterator.next());
    }

    @Test
    void iteratorEmpty() {
        Iterator iterator=test1.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    void iteratorRemove() {
       Iterator iterator = test.iterator();
        try{iterator.remove();
        fail("Remove not implemented.");}catch (UnsupportedOperationException a){assertNotEquals("",a.getMessage());}
    }

    @Test
    void toArray() {
        Object[] array = test.toArray();
        assertEquals(test.get(0), array[0]);
        assertEquals(test.size(), array.length);
    }

    @Test
    void toArrayVegetable() {
        Vegetable[] arr = test.toArray(new Vegetable[0]);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(test.get(i), arr[i]);
        }
    }

    @Test
    void add() {
        boolean a=test1.add(tomato);
        assertEquals(1, test1.size());
        assertTrue(a);
        assertEquals(tomato,test1.get(0));
    }

    @Test
    void removeObject() {
        test1.add(onion);
        int startSize=test1.size();
        boolean a = test1.remove(onion);
        assertTrue(a);
        assertEquals(test1.size(), startSize-1);
    }

    @Test
    void containsAll() {
        boolean a= test.containsAll(test);
        assertTrue(a);
    }

    @Test
    void addAllCollection() {
        List<Vegetable> newList = new VegetableList();
        newList.add(feta);
        newList.add(redPepper);
        int startSizeTest = test.size();
        int startSizeNewList = newList.size();
        boolean a = test.addAll(newList);
        assertTrue(a);
        assertEquals(startSizeTest + startSizeNewList, test.size());
        assertEquals(newList.get(0), test.get(test.size() - 2));
        assertEquals(newList.get(1), test.get(test.size() - 1));
    }

    @Test
    void addAllIndexCollection() {
        List<Vegetable> newList = new VegetableList();
        newList.add(feta);
        newList.add(redPepper);
        int startSizeTest = test.size();
        int startSizeNewList = newList.size();
        boolean a = test.addAll(2,newList);
        assertTrue(a);
        assertEquals(startSizeTest + startSizeNewList, test.size());
        assertEquals(newList.get(0), test.get(2));
        assertEquals(newList.get(1), test.get(3));
    }

    @Test
    void removeAll() {
        test.add(onion);
        test1.add(onion);
        int sizeTest = test.size();
        int sizeTest1 = test1.size();
        boolean a = test.removeAll(test1);
        assertEquals(sizeTest - sizeTest1, test.size());
        assertTrue(a);
    }

    @Test
    void retainAll() {
        test.add(onion);
        test1.add(tomato);
        test1.add(feta);
        test1.add(redPepper);
        int sizeTest1 = test1.size();
        boolean a = test.retainAll(test1);
        assertEquals(sizeTest1, test.size());
        assertTrue(a);
    }

    @Test
    void clear() {
        test.clear();
        test1.clear();
        assertTrue(test.isEmpty());
        assertTrue(test1.isEmpty());
    }

    @Test
    void get() {
        Vegetable vegetable = test.get(0);
        assertEquals(tomato, vegetable);
    }

    @Test
    void set() {
        test.set(1, onion);
        assertEquals(onion, test.get(1));
        Vegetable vegetable=test.get(1);
        assertEquals(vegetable, onion);
    }

    @Test
    void addIndexVegetable() {
        int sizeTest=test.size();
        Vegetable vegetable=test.get(1);
        test.add(1,onion);
        assertEquals(sizeTest+1, test.size());
        assertEquals(onion,test.get(1));
        assertEquals(vegetable,test.get(2));
    }

    @Test
    void removeIndex() {
        test1.add(onion);
        int startSize=test1.size();
        Vegetable vegetable = test1.remove(0);
        assertEquals(onion,vegetable);
        assertEquals(test1.size(), startSize-1);
    }

    @Test
    void indexOf() {
        Vegetable vegetable= test.get(0);
        assertEquals(0, test.indexOf(vegetable));
    }

    @Test
    void lastIndexOf() {
        test.add(tomato);
        Vegetable vegetable= test.get(0);
        assertEquals(3, test.lastIndexOf(vegetable));
    }
}