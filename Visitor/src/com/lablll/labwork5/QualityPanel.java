package com.lablll.labwork5;

public class QualityPanel implements UserButton {

    UserButton[] buttons;

    public QualityPanel() {
        buttons = new UserButton[] {new SizeButt(), new ColorButt()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (UserButton button : buttons) {
            button.accept(visitor);
        }
        visitor.visit(this);
    }
}
