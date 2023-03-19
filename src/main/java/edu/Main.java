package edu;

import edu.dpadd.lombok.altmodel.AltShape;
import edu.dpadd.lombok.model.Shape;

public class Main {
    public static void main(String[] args) {
        AltShape altShape = new AltShape();
        altShape.setName("zyx");

        Shape shape = new Shape();
        shape.setName("xyz");

        System.out.println("Ok");
    }
}
