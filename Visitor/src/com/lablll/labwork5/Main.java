package com.lablll.labwork5;

public class Main {

    public static void main(String[] args) {
        /*
        UserButton leftButton = new LeftButt();
        UserButton rightButton = new RightButt();
        UserButton centerButton = new CenterButt();
        UserButton sizeButton = new SizeButt();
        UserButton colorButton = new ColorButt();
        Visitor userVisitor = new UserVisitor();

        leftButton.accept(userVisitor);
        rightButton.accept(userVisitor);
        centerButton.accept(userVisitor);
        sizeButton.accept(userVisitor);
        colorButton.accept(userVisitor);
        */
        Visitor userVisitor = new UserVisitor();
        PositionPanel positionPanel = new PositionPanel();
        positionPanel.accept(userVisitor);//пользователя
        QualityPanel qualityPanel = new QualityPanel();
        qualityPanel.accept(userVisitor);
        Visitor devVisitor = new DevVisitor();
        positionPanel.accept(devVisitor);// принять поситетеля, который считает
        qualityPanel.accept(devVisitor);
    }
}
