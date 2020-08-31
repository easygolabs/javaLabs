package com.lab111.labwork7;

public class PencilTool implements DrawingTools {
    @Override
    public void useInstrument(WorkingSpace selected) {
        System.out.println("Рисую карандашом");
       // selected.pressButton(new BrushTool());
    }
}
