package com.lablll.labwork5;

public class UserVisitor implements Visitor {
    @Override
    public void visit(LeftButt leftButt) {
        System.out.println("Set object left");
    }

    @Override
    public void visit(RightButt rightButt) {
        System.out.println("Set object right");
    }

    @Override
    public void visit(SizeButt sizeButt) {
        System.out.println("Change object size");
    }

    @Override
    public void visit(CenterButt centerButt) {
        System.out.println("Set object center");
    }

    @Override
    public void visit(ColorButt colorButt) {
        System.out.println("Change object color");
    }

    @Override
    public void visit(PositionPanel positionPanel) {
        System.out.println(" - All Element of position panel ");
    }

    @Override
    public void visit(QualityPanel qualityPanel) {
        System.out.println(" - ALl Element of quality panel ");
    }
}
