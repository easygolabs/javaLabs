package com.lablll.labwork5;

public class LeftButt implements UserButton{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
