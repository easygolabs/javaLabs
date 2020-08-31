package com.lablll.labwork5;

public interface Visitor {

    void visit(LeftButt leftButt);
    void visit(RightButt rightButt);
    void visit(SizeButt sizeButt);
    void visit(CenterButt centerButt);
    void visit(ColorButt colorButt);

    void visit(PositionPanel positionPanel);

    void visit(QualityPanel qualityPanel);
}
