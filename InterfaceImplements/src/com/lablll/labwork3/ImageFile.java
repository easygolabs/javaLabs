package com.lablll.labwork3;

public class ImageFile implements MyObject {
    private MyObject myObject;
    private double size=0;
    private String name="";
    ImageFile(String name,double size){
        this.name=name;
        this.size=size;
    }

    @Override
    public void addParent(MyObject fs) {
        this.myObject=myObject;
    }

    @Override
    public void addObject(MyObject object) {
        MyObject directoryB=new Directory();
        myObject.addObject(directoryB); //записывает нашу папку в массив objectsTree
        directoryB.addObject(this);
        directoryB.addObject(object);
        myObject.removeObject(this);
        myObject=directoryB;
    }

    @Override
    public void removeObject(MyObject object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void message() {
        System.out.println("This "+ this.getClass().getSimpleName()+" named:  "+name+", has size : "+size);
    }

    @Override
    public double directorySize() {
        return size;
    }
}
