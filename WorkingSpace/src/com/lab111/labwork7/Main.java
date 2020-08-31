package com.lab111.labwork7;

public class Main {

    public static void main(String[] args) {

	    WorkingSpace workingSpace=new WorkingSpace();
	    workingSpace.pressButton(new PencilTool());
        workingSpace.useInstrument();
        workingSpace.pressButton(new BrushTool());
        workingSpace.useInstrument();
    }
}
