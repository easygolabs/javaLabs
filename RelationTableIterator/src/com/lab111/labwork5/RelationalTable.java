package com.lab111.labwork5;

public class RelationalTable implements Container {
    private int sizeLength = 3;//длина
    private int sizeTop = 3;//высота
    private Object[][] relationalTable;
    private int count = 0;
    private boolean flag1 = false;
    private boolean flag2 = false;

    public  RelationalTable() {//сначала 3*3
        relationalTable = new Object[sizeTop][sizeLength];
    }

    public void add (Object[] temp) {
        flag1 = false;
        flag2 = false;
        if(count == sizeTop ) {
            sizeTop = 2*sizeTop;
            Object[][] relationalTable2 = new Object[sizeTop][sizeLength];
            for (int i = 0; i < relationalTable.length; i++) {
                for (int j = 0; j < relationalTable[i].length; j++) {
                    relationalTable2[i][j] = relationalTable[i][j];
                }
            }
            relationalTable = relationalTable2;
        }
        relationalTable[count++] = temp;
    }


    @Override
    public Iterator getIterator() {
        flag1 = true;
        return new RelationalTableIterator();
    }

    @Override
    public Iterator getIteratorPrev() {
        flag2 = true;
        return new RelationalTableIteratorPrev();
    }


    private class RelationalTableIterator implements Iterator{

        Object[] arr;//в этот массив запишем наш двумерный массив
        int indexOfEll=0;

        RelationalTableIterator() {
            arr  = new Object[sizeLength * count];
            for(int i = 0; i < count; i++ ) {
                for (int j = 0; j < relationalTable[i].length; j++) {
                    arr[indexOfEll++] = relationalTable[i][j];
                }
            }
            indexOfEll = 0;
        }

        @Override
        public boolean hasNext() {
            return indexOfEll < arr.length;
        }

        @Override
        public Object next() {
            int counter = 0;
                arr  = new Object[sizeLength * count];
                for(int i = 0; i < count; i++ ) {
                    for (int j = 0; j < sizeLength; j++) {
                        arr[counter++] = relationalTable[i][j];
                    }
                }
            return arr[indexOfEll++] ;
        }
    }

    private class RelationalTableIteratorPrev implements Iterator{

        Object[] arr;
        int indexOfEll=0;

        RelationalTableIteratorPrev() {
            arr  = new Object[sizeLength * count];
            for(int i = 0; i < count; i++ ) {
                for (int j = 0; j < sizeLength; j++) {
                    arr[indexOfEll++] = relationalTable[i][j];
                }
            }
            --indexOfEll;
        }

        @Override
        public boolean hasNext() {
            return indexOfEll >= 0;
        }

        @Override
        public Object next() {
            if(!flag1) {
                indexOfEll=0;
                arr  = new Object[sizeLength * count];
                for(int i = 0; i < count; i++ ) {
                    for (int j = 0; j < sizeLength; j++) {
                        arr[indexOfEll++] = relationalTable[i][j];
                    }
                }
                --indexOfEll;
                flag1 = true;
            }
            return arr[indexOfEll--] ;
        }
    }

    void select(Object index){
        for(int i = 0; i < count; i++ ) {
            for (int j = 0; j < sizeLength; j++) {
                if(index.equals(relationalTable[i][j])) {
                    System.out.println(relationalTable[i][j]);
                }
            }
        }
    }
}