package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom1 = new Bedroom("Oda1",
                new Wall("Wall1 oluşturuldu"),
                new Wall("Wall2 oluşturuldu"),
                new Wall("Wall3 oluşturuldu"),
                new Wall("Wall4 oluşturuldu"),
                new Ceiling(3, PaintColor.WHITE),
                new Bed("Style 1",4,1,2,1),
                new Lamp(LampType.NEON,true,5),
                new Wardrobe(3,2,210.45),
                new Carpet(1,3, PaintColor.GREEN));


    }
}