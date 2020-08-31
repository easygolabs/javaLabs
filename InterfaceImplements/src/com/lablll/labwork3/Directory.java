package com.lablll.labwork3;

import java.util.ArrayList;
import java.util.List;

public class Directory implements MyObject {

    private MyObject myObject;
    private List<MyObject> objectsTree = new ArrayList<>();

    @Override
    public void addParent(MyObject myObject) {
        this.myObject=myObject;
    }

    public void addObject(MyObject object) {
        objectsTree.add(object);
        object.addParent(this);
    }

    public void removeObject(MyObject object) {
        objectsTree.remove(object);
    }

    @Override
    public void message() {
        for (MyObject object : objectsTree) {
            object.message();
        }
        System.out.println("This directory size is: "+ directorySize()+"\n");
    }

    @Override
    public double directorySize() {
        double allSize=0;
        for (MyObject object : objectsTree) {

            allSize=allSize + object.directorySize();

        }
        return allSize;
    }
}