package com.lablll.labwork5;

public class RightButt implements UserButton {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
