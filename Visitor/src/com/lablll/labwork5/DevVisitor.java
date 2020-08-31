package com.lablll.labwork5;

public class DevVisitor implements Visitor {

    private int posCount = 0;
    private int qualCount = 0;

    @Override
    public void visit(LeftButt leftButt) {
        ++posCount;
        System.out.println("LeftButt is element of Position panel");
    }

    @Override
    public void visit(RightButt rightButt) {
        ++posCount;
        System.out.println("RightButt is element of Position panel");
    }

    @Override
    public void visit(SizeButt sizeButt) {
        ++qualCount;
        System.out.println("SizeButt is element of Quality panel");
    }

    @Override
    public void visit(CenterButt centerButt) {
        ++posCount;
        System.out.println("CenterButt is element of Position panel");
    }

    @Override
    public void visit(ColorButt colorButt) {
        ++qualCount;
        System.out.println("ColorButt is element of Quality panel");
    }

    @Override
    public void visit(PositionPanel positionPanel) {
        System.out.println("Number of Position button is : " + posCount);
    }

    @Override
    public void visit(QualityPanel qualityPanel) {
        System.out.println("Number of Quality button is : " + qualCount);
    }
}
