package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ListIterator;

public class VegetableList implements List<Vegetable> {
    private int size=0; //размер List

    private ListNode head;
    private ListNode tail;

    //Пустой конструктор
    public VegetableList(){
    }
    public VegetableList(Vegetable vegetable){
        add(vegetable);
    }
    public VegetableList(Collection<? extends Vegetable> c){
        addAll(c);
    }
    //Класс для хранения узлов
    private class ListNode {
        private Vegetable vegetable;
        private ListNode next;
        private ListNode prev;

        private ListNode(Vegetable vegetable) {
            this.vegetable = vegetable;
        }

        private ListNode(Vegetable vegetable, ListNode next, ListNode prev) {
            this.vegetable=vegetable;
            this.next = next;
            this.prev = prev;
        }
    }
    //Возвразает размер VegetableList
    @Override
    public int size() {
        return size;
    }
    //Возвращает пуста ли коллекция
    @Override
    public boolean isEmpty() {
        return size==0;
    }
    //Возвращает true, если этот список содержит указанный элемент
    @Override
    public boolean contains(Object o) {
        if (head == null) {
            return false;
        }
        for (ListNode data = head; data != null; data = data.next) {
            if (o.equals(data.vegetable)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Vegetable> iterator() {
        return new Iterator<>(){
            private int position = 1;

            @Override
            public boolean hasNext() {
                if(position <= size()){
                    return true;
                }
                return false;
            }

            @Override
            public Vegetable next() {
                Vegetable data = get(position);
                position++;
                return data;
            }

            @Override
            public void remove() {
                VegetableList.this.remove(position);
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int number = 0;
        for (ListNode data = head; data!= null; data = data.next)
            result[number++] = data.vegetable;
        return result;
    }
    //Возвращает массив, содержащий все элементы в этом списке
    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] array) {
        if (array.length < size)

            array = (T[]) Array.newInstance(
                    array.getClass().getComponentType(), size);
        int number = 0;
        Object[] result = array;
        for (ListNode data = head; data != null; data = data.next)
            result[number++] = data.vegetable;

        if (array.length > size) {
            array[size] = null;
        }
        return array;
    }
    //Добавляет элемент в список
    @Override
    public boolean add(Vegetable vegetable) {
        //Добавление в конец списка
        ListNode newNode = new ListNode(vegetable);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        /*
        //Добавление в начало списка
        ListNode newNode = new ListNode(vegetable);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;*/
        return true;
    }
    //Удаляет элемент, возвращая его содержимое
    @Override
    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }
        for (ListNode data = head; data != null; data = data.next) {
            if (o.equals(data.vegetable)) {
                unlink(data);
                return true;
            }
        }
        return false;
    }
    private void unlink(ListNode data) {
        final ListNode next = data.next;
        final ListNode prev = data.prev;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            data.prev = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            data.next = null;
        }
        data.vegetable = null;
        size--;
    }
    //Возвращает, содержатся ли все элементы c в коллекции
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c)
            if (contains(o)) {
                return true;
            }
        return false;
    }
    //Добавляет все элементы в указанной коллекции до конца
    @Override
    public boolean addAll(Collection<? extends Vegetable> c) {
        for (Vegetable vegetable : c) {
            add(vegetable);
        }
        return true;
    }
    //Добавляет все элементы в указанной коллекции до конца начиная с index
    @Override
    public boolean addAll(int index, Collection<? extends Vegetable> c) {
        if (index == size) {
            addAll(c);
            return true;
        }
        if (c.isEmpty()) {
            return false;
        }
        VegetableList listAdd = new VegetableList(c);
        final ListNode newHead = listAdd.head;
        final ListNode newTail = listAdd.tail;
        if (index == 0) {
            newTail.next = head;
            newHead.prev = head.prev;
            head.prev = newTail;
            head = newHead;
        } else {
            ListNode temp = getElement(index);
            final ListNode prev = temp.prev;

            prev.next = newHead;
            newHead.prev = prev;

            temp.prev = newTail;
            newTail.next = temp;
        }
        size += c.size();
        return true;
    }
    //Узнаём после какого элемента нам нужно вставлять коллекцию
    private ListNode getElement(int index){
        ListNode needEl=head;
        for (int i=0;i<index;i++){
            needEl=needEl.next;
        }
        return needEl;
    }
    //Удаляет все элементы из коллекции
    @Override
    public boolean removeAll(Collection<?> c) {
        boolean logicValue = false;
        for (Object o : c) {
            logicValue = logicValue || remove(o);
        }
        return logicValue;
    }
    //Удаление элементов из списка, которые не содержатся в указанной коллекции.
    @Override
    public boolean retainAll(Collection<?> c) {
        if(c == null)
        {
            throw new NullPointerException("Сollection is null");
        }
        Iterator itr = iterator(); //перебираем список
        boolean found = false;
        while(itr.hasNext())
        {
            if(!c.contains(itr.next()))
            {
                itr.remove();
                found = true;
            }
        }
        return found;
    }
    //Обнуляет список
    @Override
    public void clear() {
        head=tail=null;
        size=0;
    }
    @Override
    public Vegetable get(int index) {
        return getElement(index).vegetable;
    }
    //Устанавливает новый овощ по индексу, возвращая старый
    @Override
    public Vegetable set(int index, Vegetable element) {
        ListNode data = getElement(index);
        Vegetable oldVegetable = data.vegetable;
        data.vegetable = element;
        return oldVegetable;
    }
    //Добавляет элемент по индексу
    @Override
    public void add(int index, Vegetable element) {
        if (index == size) {
            add(element);
        }
        else {
            ListNode data = getElement(index);
            final ListNode prev = data.prev;
            final ListNode newNode = new ListNode(element,data,prev);
            data.prev = newNode;
            if (prev == null)
                head = newNode;
            else
                prev.next = newNode;
            size++;
        }
    }
    //Удаляет элемент по индексу и возвращает его
    @Override
    public Vegetable remove(int index) {
        ListNode removeEll=head;
        for(int i=0;i<index;i++){
            removeEll=removeEll.next;
        }
        Vegetable v=removeEll.vegetable;//Определяем овощ
        unlink(removeEll);
        return v;
    }
    //Возвращает индекс первого вхождения указанного элемента
    //в этом списке или -1, если этот список не содержит элемент.
    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (ListNode data = head; data != null; data = data.next) {
            if (o.equals(data.vegetable)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    //Возвращает индекс последнего вхождения указанного элемента
    //в этом списке или -1, если этот список не содержит элемент.
    @Override
    public int lastIndexOf(Object o) {
        int index = size-1;
        for (ListNode data = tail; data != null; data = data.prev) {
            if (o.equals(data.vegetable)) {
                return index;
            }
            index--;
        }
        return -1;
    }
    @Override
    public ListIterator<Vegetable> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<Vegetable> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Vegetable> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }
}
