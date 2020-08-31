package com.lablll.labwork2;

public class Cl3 extends Cl1 implements If3 {

    private If1 if1;

    @Override
    public void meth3() {
        System.out.println("Name of the current class: " + this.getClass().getSimpleName());
        System.out.println("Name of the current method:" + new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
