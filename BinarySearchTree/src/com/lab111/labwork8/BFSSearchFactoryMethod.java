package com.lab111.labwork8;

public class BFSSearchFactoryMethod implements SearchFactoryMethod {
    @Override
    public Search typeSearch() {
        return new BFS();
    }
}
