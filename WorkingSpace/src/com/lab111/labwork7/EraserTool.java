package com.lab111.labwork7;

public class EraserTool implements DrawingTools {
    @Override
    public void useInstrument(WorkingSpace selected) {
        System.out.println("Стираю ластиком.");
        //selected.pressButton(new PencilTool());
    }
}
