package com.lablll.labwork2;

public class Cl2 implements If2 {

    private Cl1 cl1;

    @Override
    public void meth2() {
        System.out.println("Name of the current class: " + this.getClass().getSimpleName());
        System.out.println("Name of the current method:" + new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
