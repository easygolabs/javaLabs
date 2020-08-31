package com.lab111.labwork7;

public class WorkingSpace {

    private DrawingTools button;

    public void pressButton(DrawingTools button){ //нажали на определённую кнопку(карандаш, кисть, ластик)
        this.button=button;
    }

    public void useInstrument(){          //использовать инструмент, который мы выбрали
        button.useInstrument(this);
    }
}
