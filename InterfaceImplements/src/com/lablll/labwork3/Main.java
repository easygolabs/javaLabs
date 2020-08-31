package com.lablll.labwork3;

public class Main {

    public static void main(String[] args) {

        MyObject textFi1e1=new TextFile("textFi1e1",100.5,null);
        MyObject textFi1e=new TextFile("textFi1e",10.5,null);

        MyObject directory=new Directory();

        //directory.addObject(textFi1e);
        textFi1e.addObject(textFi1e1);

        directory.message();
/*
        MyObject textFi1e=new TextFile("textFile",10.5,null);
        MyObject textFi1e1=new TextFile("textFile2",10.5,null);
        MyObject imageFile=new ImageFile("imageFile",20.0);
        MyObject videoFile=new VideoFile("videoFile",400.0);
        MyObject audioFile=new AudioFile("audioFile",30.0);

        MyObject directory=new Directory();
        MyObject directory1=new Directory();
        MyObject directory2=new Directory();
        MyObject directory3=new Directory();

        directory1.addObject(textFi1e);
        directory1.addObject(imageFile);

        directory2.addObject(videoFile);
        directory2.addObject(audioFile);

        directory3.addObject(textFi1e1);

        directory1.addObject(directory3);

        directory.addObject(composite1);
        directory.addObject(directory2);

        directory.message();
        */
    }
}
