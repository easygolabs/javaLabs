package com.lab111.labwork8;

public class DFSSearchFactoryMethod implements SearchFactoryMethod {
    @Override
    public Search typeSearch() {
        return new DFS();
    }
}
