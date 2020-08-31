package com.lablll.labwork3;

public interface MyObject {
    void addParent(MyObject myObject);
    void addObject(MyObject object);
    void removeObject(MyObject object);
    void message();
    double directorySize();
}
