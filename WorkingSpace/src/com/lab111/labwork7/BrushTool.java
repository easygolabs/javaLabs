package com.lab111.labwork7;

public class BrushTool implements DrawingTools {
    @Override
    public void useInstrument(WorkingSpace selected) {
        System.out.println("Рисую кистью");
       // selected.pressButton(new EraserTool());
    }
}
