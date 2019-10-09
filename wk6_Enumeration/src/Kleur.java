import org.jetbrains.annotations.Contract;

import java.awt.*;

public enum Kleur {
    ROOD (Color.RED), ORANJE (Color.ORANGE), GROEN (Color.GREEN);

    private Color c;

    Kleur(Color c) {
           this.c = c;
    }

    public Color getColor(){
        return c;
    }

}
