package com.lablll.labwork5;

public class PositionPanel implements UserButton {

    private UserButton[] buttons;

    public PositionPanel() {
        this.buttons = new UserButton[] {new CenterButt(), new LeftButt(), new RightButt()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (UserButton button : buttons) {
            button.accept(visitor);
        }
        visitor.visit(this);
    }
}
